package day05;
import java.util.*;
public class MethodDemo_1 {
    public static void main(String[] args) {
        //printRect();
        int number = getNumber();
        System.out.println(number);
    }

    public static void printRect(){
        for(int i = 0 ; i<5;i++){
            for(int j = 0 ; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
