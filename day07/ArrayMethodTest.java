package day07;

/**
 * Created by Qingge on 2017/5/16.
 */
public class ArrayMethodTest {
    public static void main(String[] args) {
        int[] arr = {11,44,55,33,66};
        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i<arr.length;i++){
            if(i == arr.length -1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }

    public static void reverse(int[] arr){
        for(int min=0, max = arr.length - 1 ; min<max;min++,max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
    }


}
