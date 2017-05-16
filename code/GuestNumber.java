package code;
import java.util.Random;
import java.util.Scanner;

public class GuestNumber {
    public static void main(String[] args) {
        System.out.println("猜数字开始了");
        System.out.println("输入1-100之间数据");

        Random ran = new Random();
        int ranNum = ran.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);

        while(true){
            int number = sc.nextInt();
            if(number > ranNum){
                System.out.println("猜大了");
            }else if(number < ranNum){
                System.out.println("猜小了");
            }else if(number == ranNum){
                System.out.println("中了");
                break;
            }
        }
    }
}
