package other_for_job.NetEase;

/**
 * @Author haowus919@gmail.com in dormitory
 * @Date 2020/8/8 15:24
 */
public class ne03 {
    private static int res;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int batch = sc.nextInt();
//        for (int i=0;i<batch;i++){
//            int number = sc.nextInt();
//            int [] nums = new int[number];
//            for (int j=0;j<nums.length;i++){
//                nums[j] = sc.nextInt();
//            }
//            System.out.println(drop(nums));
//        }
        int[] nums = new int[]{30,60,5,15,30};
        a3(nums,0,0,0,0);
        System.out.println(res);
    }
    public static void a3(int[] item,int index,int x,int y,int r){
        if(index == item.length){
            if(x == y)
                res = Math.min(r,res);
            return;
        }
        a3(item,index+1,x+item[index],y,r);
        a3(item,index+1,x,y+item[index],r);
        a3(item,index+1,x,y,r+item[index]);
    }
}
