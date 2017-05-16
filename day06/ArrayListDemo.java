package day06;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("abc");
        array.add("itcast");
        array.add("love");
        array.add("java");

        int size = array.size();

        System.out.println(size);

        String s = array.get(1);
        System.out.println(s);
    }
}
