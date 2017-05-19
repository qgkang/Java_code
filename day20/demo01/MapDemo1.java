package day20.demo01;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a", 11);
        map.put("b", 12);
        map.put("c", 13);
        map.put("d", 14);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"......"+value);
        }
        System.out.println("=======================");
        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"......"+value);
        }

    }
}
