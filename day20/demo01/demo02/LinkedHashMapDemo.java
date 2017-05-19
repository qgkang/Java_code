package day20.demo01.demo02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> link = new LinkedHashMap<String,String>();
        link.put("1", "a");
        link.put("13", "b");
        link.put("15", "c");
        link.put("17", "d");
        System.out.println(link);
        Set<String> set = link.keySet();
        for(String key: set){
            System.out.println(link.get(key));
        }

        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1", "a");
        map.put("13", "b");
        map.put("15", "c");
        map.put("17", "d");
        System.out.println(map);
        Set<String> set2 = map.keySet();
        for(String key2: set2){
            System.out.println(map.get(key2));
        }
    }
}
