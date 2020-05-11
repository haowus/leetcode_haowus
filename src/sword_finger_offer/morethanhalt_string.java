package sword_finger_offer;

import java.util.HashMap;
import java.util.Map;

public class morethanhalt_string {
    public int MoreThanHalfNum_Solution(int [] array) {

//        int threshold = array.length/2;
//        Map<Integer,Integer> res = new HashMap<>();
//        for (int i=0;i<array.length;i++){
//            res.put(array[i],res.getOrDefault(array[i],0)+1);
//            if (res.get(array[i])>=threshold)
//                return array[i];
//        }
//        return 0;


        int length=array.length;
        if(array==null||length<=0){
            return 0;
        }

        int result=array[0];
        int times=1;
        for(int i=1;i<length;i++){
            if(times==0){
                result=array[i];
                times=1;
            }else{
                if(array[i]==result){
                    times++;
                }else{
                    times--;
                }
            }
        }

        times=0;
        for(int i=0;i<length;i++){
            if(result==array[i]){
                times++;
            }
        }

        if (times * 2 >length) {
            return result;
        }
        return 0;
    }
}
