package code;

public class Operator_1 {
    public static void main(String[] args){
        int i = 5;
        int j = i++;
        System.out.println(i); //6
        System.out.println(j); //5

        int m = 5;
        int n = ++m;
        System.out.println(m);//6
        System.out.println(n);//6
    }
}
