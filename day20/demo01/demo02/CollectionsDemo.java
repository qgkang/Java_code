package day20.demo01.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class CollectionsDemo {
    public static void main(String[] args) {
        function_2();
    }

    public static void function_2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(11);
        list.add(8);
        list.add(10);
        list.add(15);
        list.add(20);
        //System.out.println(list);
        //Collections.shuffle(list);
        //System.out.println(list);

        //int index = Collections.binarySearch(list,15);
        //System.out.println(index);

        Collections.sort(list);
        System.out.println(list);
    }
}
