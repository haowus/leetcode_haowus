package algorithms;

public class cardGroup {
    public boolean hasGroupsSizeX(int[] deck) {

        int[] ans = new int[10000];
        for (int i=0;i<deck.length;i++){
            ans[deck[i]]++;          //计算每个数字出现的次数
        }
        int x = ans[deck[0]];
        for (int j:ans){
            if (j!=0)
                x = is(x,j);
        }
        return x>=2;
    }
    public int is(int a,int b){              //计算两个数的最大公因数
        while (a%b!=0){
            int c = a%b;
            a = b;
            b = c;
        }
        return b;
    }
}
