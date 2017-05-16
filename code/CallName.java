package code;
import java.util.*;
/**
 * Created by Qingge on 2017/5/15.
 */
public class CallName {
    public static void main(String[] args) {
        String[] names = {"张三","李四","王五","李蕾","韩梅梅","小名","老王","小华","约翰逊","爱丽丝"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        System.out.println("=============");
        Random ran = new Random();
        int index = ran.nextInt(names.length);

        System.out.println(names[index]);
    }
}
