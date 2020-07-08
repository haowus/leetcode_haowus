package leetcode_sf_offer;

/**
 * 剑指 Offer 56 - I. 数组中数字出现的次数
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/7/8 21:20
 * 位运算   异或^   1^1=0  1^0=1
 */
public class IQ_56_I {
    public int[] singleNumbers(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i=0;i<nums.length;i++)
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        for (int key:map.keySet())
//            if (map.get(key)==1)
//                res.add(key);
//        int[] out = new int[2];
//        for (int i=0;i<res.size();i++)
//            out[i] = res.get(i);
//        return out;
        int k=0;
        for (int i:nums)
            k ^= i;   //k:两个不同的数的异或
        int mask = 1;
        while ((k & mask) ==0)
            mask <<= 1;   //mask:找到能让两个不同数分开的那一位
        int a=0,b=0;
        for (int i:nums){
            if ((mask& i) ==0)
                a ^= i;
            else
                b ^= i;
        }

        return new int[]{a,b};
    }
}
