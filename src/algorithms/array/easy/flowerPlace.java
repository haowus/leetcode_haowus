package algorithms.array.easy;

public class flowerPlace {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count =0,k=0;
        while (k<flowerbed.length){
            if (flowerbed[k]==0 && (k==0||flowerbed[k-1]==0) && (k==flowerbed.length-1||flowerbed[k+1]==0)){
                flowerbed[k]=1;
                count++;
            }
            k++;
            if (count>=n)
                return true;
        }
        return false;

    }
}
