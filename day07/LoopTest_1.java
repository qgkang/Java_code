package day07;

/**
 * Created by Qingge on 2017/5/16.
 */
public class LoopTest_1 {
    public static void main(String[] args) {
        int bai = 0;
        int shi = 0;
        int ge = 0;

        for(int i=100;i<1000;i++){
            bai = i/100;
            shi = i/10%10;
            ge = i%10;

            if(bai*bai*bai + shi*shi*shi + ge*ge*ge == i){
                System.out.println(i);
            }
        }
    }
}
