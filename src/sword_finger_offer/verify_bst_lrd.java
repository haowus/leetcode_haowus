package sword_finger_offer;

public class verify_bst_lrd {
    public boolean VerifySquenceOfBST(int [] sequence) {

        if (sequence==null||sequence.length==0) return false;
        return helpVerify(sequence,0,sequence.length-1);

    }
    public boolean helpVerify(int[] sequence,int start,int end){
        if (start==end) return true;
        int root = sequence[end];
        int i;
        for (i=start;i<end;i++){
            if (sequence[i]>root)
                break;
        }
        //在右子树中检查是否有不符合后序遍历规则的元素
        for (int j=i;j<end;j++)
            if (sequence[j]<root)
                return false;
        return helpVerify(sequence,start,i-1)&&helpVerify(sequence,i,end-1);

    }
}
