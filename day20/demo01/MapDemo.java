package day20.demo01;
import java.util.HashMap;
import java.util.Map;
public class MapDemo {
    public static void main(String[] args) {
        function();
    }

    public static void function_2(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);

        String value = map.remove(3);
        System.out.println(value);
        System.out.println(map);
    }

    public static void function_1(){
        //创建集合对象,作为键的对象整数,值的对象存储字符串
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        System.out.println(map);

        String value = map.get(4);
        System.out.println(value);
    }

    public static void function(){
        //创建集合对象,HashMap,存储对象,键是字符串,值是整数
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);

        map.put("b", 2);

        map.put("c", 3);

        System.out.println(map);
    }

}
