package day07;

/**
 * Created by Qingge on 2017/5/16.
 */
public class LoopTest_3 {
    public static void main(String[] args) {
        print99();
    }

    public static void print99(){
        for(int i=1;i<10;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
