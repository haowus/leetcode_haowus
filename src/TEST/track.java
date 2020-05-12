package TEST;

import java.util.Scanner;

public class track {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int builds = sc.nextInt();
        int maxDis = sc.nextInt();
        int [] location = new int[builds];
        for (int i=0;i<builds;i++)
            location[i] = sc.nextInt();

        int count_plan = 0;

        int [] plans = new int[3];
        int k=1;
        int j = 0;
        int count=0;
//        for (int i=1;i<location.length;i++){
//            plans[k] = location[0];
//
//            if (location[i]-location[0]<maxDis)
//                plans[k] = location[i];
//
//        }
        while (k<3 && j<13){

            for (int i=1;i<location.length;i++){
                plans[0] = location[i];
                j = i+1;
                while (location[j]-location[i]<maxDis && k<3){
                    plans[k] = location[j];
                    k++;
                    j++;
                }
                count++;



        }
    }
}
}
