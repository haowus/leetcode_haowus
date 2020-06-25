package TEST;

/**
 * @Author haowus919@gmail.com in lab
 * @Date 2020/6/24 20:30
 */
public class Robot {
    private String name;
    public void sayHi(String helloSentence){
        System.out.println(helloSentence+" "+name);
    }
    private String throwHello(String tag){
        return "private method "+tag;
    }
}
