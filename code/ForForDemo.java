package code;

/**
 * Created by Qingge on 2017/5/15.
 */
public class ForForDemo {
    public static void main(String[] args) {
        for(int i =0;i<9;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
