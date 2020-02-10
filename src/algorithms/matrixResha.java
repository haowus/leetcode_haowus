package algorithms;



public class matrixResha {
    public int[][] matrixReshape(int[][] nums,int r,int c){

        if (r*c!=nums[0].length*nums.length)
            return nums;
        int[][] result = new int[r][c];
        int row=0,col=0;
        for(int[] i:nums)
            for(int j:i){
                result[row][(col++)%c] = j;
                if(col%c==0)
                    row++;
            }
        return result;
    }

}
