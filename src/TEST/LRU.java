package TEST;

import java.util.HashMap;
import java.util.Iterator;


public class LRU<K, V> implements Iterable<K> {

    private Node head;
    private Node tail;
    private HashMap<K, Node> map;
    private int maxSize;

    private class Node {    //双向链表
        Node pre;
        Node next;
        K k;
        V v;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    public LRU(int maxSize) {
        this.maxSize = maxSize;
        this.map = new HashMap<>(maxSize * 4 / 3);

        head = new Node(null, null);      //head: 头部
        tail = new Node(null, null);     //tail : 尾部

        head.next = tail;                 //初始化的时候  链表中只有两个节点head,tail
        tail.pre = head;
    }

    public V get(K key) {                         //访问   根据键key取值value
        if (!map.containsKey(key)) return null;

        Node node = map.get(key);         //根据键key，从hash中取出该节点   （不用遍历链表就可以找到这个节点   O(1)复杂度）
        unlink(node);                     //把该节点从当前位置删去        (O(1)复杂度)
        appendHead(node);                 //把该节点插到链表的头部

        return node.v;
    }

    public void put(K key, V value) {   //把节点node(key,value)放入链表
        if (map.containsKey(key)) {                //先看hash中是否存在该节点，若存在，删除该节点。
            Node node = map.get(key);
            unlink(node);
        }
        Node node = new Node(key, value);           //把该key,value包装成一个node
        map.put(key, node);                         //把node  根据key放入hash中
        appendHead(node);                           //把该节点放入链表头部

        if (map.size() > maxSize) {           //当hash的容量超过最大值的时候，
            Node toRemove = removeTail();     //取出链表中最后一个节点
            map.remove(toRemove.k);           //根据要链表中最后一个节点的k，在hash中删掉该节点。
        }
    }

    private void unlink(Node node) {    //删除该节点
        Node pre = node.pre;
        Node next = node.next;

        pre.next = next;
        next.pre = pre;

        node.pre = null;
        node.next = null;
    }

    private void appendHead(Node node) {   //把该节点放到链表的头部
        Node next = head.next;
        node.next = next;
        next.pre = node;
        node.pre = head;
        head.next = node;
    }

    private Node removeTail() {    //删除尾部节点，因为tail是空节点，所以tail.pre是链表中最后一个节点
        Node node = tail.pre;

        Node pre = node.pre;
        tail.pre = pre;
        pre.next = tail;

        node.pre = null;
        node.next = null;

        return node;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            private Node cur = head.next;

            @Override
            public boolean hasNext() {
                return cur != tail;
            }

            @Override
            public K next() {
                Node node = cur;
                cur = cur.next;
                return node.k;
            }
        };
    }
}

