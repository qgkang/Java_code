package day05;

/**
 * Created by Qingge on 2017/5/16.
 */
public class MethodDemo_3 {
    public static void main(String[] args) {
        /*int a = 1;
        int b = 2;
        change(a,b);
        System.out.println(a);//1
        System.out.println(b);//2
        */
        int[] arr = {1,2,3,4};
        System.out.println(arr[2]);//3
        change(arr);
        System.out.println(arr[2]);//100,方法参数是引用类型，传递的是内存地址
    }

    public static void change(int a,int b){
        a = a+b;//3
        b = b+a;//5
        System.out.println(a);//3
        System.out.println(b);//5
    }

    public static void change(int[] arr){
        arr[2] = 100;
    }
}
