package code;

public class Operator_5 {
    public static void main(String[] args){
        System.out.println(3>5?99:88);//88

        String s = 0==1?"哈哈":"呵呵";
        System.out.println(s);//呵呵


        int a = 5;
        int b = 3;
        int c = 1;
        //         T  && T
        int n2 = (a>b && b>c) ? (c++) : (++c);
        System.out.println(c);//2
        System.out.println(n2);//1
    }
}
