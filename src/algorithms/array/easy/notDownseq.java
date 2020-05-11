package algorithms.array.easy;

public class notDownseq {
    public boolean checkPossibility(int[] nums) {

        if(nums.length<3) return true;
        int count = 0;
        //改变尽量往小的改，这样更能满足条件
        if(nums[0]>nums[1]){//当0的位置的数大于1位置时 我们可以改变0位置的，因为0位置前面没有数
            nums[0]=nums[1];
            count++;
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){//当i位置当数大于i+1得数，我们就要进行改变
                count++;
                if(count>1)
                    return false;//改变次数大于1 就不满足条件 返回false
                if(nums[i-1]>nums[i+1]){//改变尽量往小的改，这样更能满足条件，改变i+1的
                    nums[i+1]=nums[i];
                }else{//改变i的
                    nums[i]=nums[i+1];
                }
            }
        }
        return true;
    }
}
