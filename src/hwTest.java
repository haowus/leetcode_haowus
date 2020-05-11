import java.util.Random;
import java.util.Scanner;


   class Hero{
        private String name;
        private int hp;
        private int ad;
        private int df;

        Hero(){}

        Hero(String name,int hp,int ad,int df){
            this.name = name;
            this.hp = hp;
            this.ad = ad;
            this.df = df;
        }

        public void attack(Hero other){
            Random random = new Random();
            // 假设传一个1000点的ad,真实攻击力=ad*随机范围的一个数(最低是200，最高1000)
            // 真实攻击力
            int realAd = random.nextInt((int) (ad * 0.8)) + (int) (ad * 0.2);
            System.out.println(this.name + "发起了" + realAd + "攻击力");
            // 对方会调用防御
            other.defense(realAd);

        }
        public void defense(int ad){
            Random random = new Random();
            // 假设传一个1000点的df,真实防御力=df*随机范围的一个数(最低是200，最高1000)
            // 真实防御力
            int realDf = random.nextInt((int) (df * 0.8)) + (int) (df * 0.2);
            // 对方有效的攻击力=对方的真实攻击力-自己的真实防御力
            int validAd = ad - realDf;
            if (validAd < 0) {
                validAd = 0;
            }
            this.hp = this.hp - validAd;
            if (hp < 0) {
                hp = 0;
            }
            System.out.println(this.name + "受到了" + validAd + "有效伤害,"
                    + "真实防御" + realDf + ",还剩" + this.hp + "血量");

        }
        // 判断是否存放,血量>0表示还活着
        public boolean isAlive() {
            return this.hp > 0;
        }

    }
public class hwTest {
    public static void main(String[] args) {

        Hero js = new Hero("剑圣", 3000, 700, 200);
        Hero gl = new Hero("盖伦", 3000,600, 300);

        while (js.isAlive() && gl.isAlive()) {
            js.attack(gl);

            if (gl.isAlive()) {
                gl.attack(js);
                if (!js.isAlive()) {
                    System.out.println("剑圣已死");
                }

            } else {
                System.out.println("盖伦已死");
            }

        }
    }

}
