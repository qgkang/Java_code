package day07;

/**
 * Created by Qingge on 2017/5/16.
 */
public class LoopTest_2 {
    public static void main(String[] args) {
        char xiao = 'a';
        char da = 'A';

        for(int i =0 ; i < 26; i++){
            System.out.println(xiao + "  " + da);
            xiao++;
            da++;
        }
    }
}
