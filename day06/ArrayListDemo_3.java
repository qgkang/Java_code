package day06;
import java.util.ArrayList;
public class ArrayListDemo_3{
    public static void main(String[] args){

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        //在索引2上,添加元素7
        array.add(2,7);

        //将0索引上的元素,修改成10
        array.set(0,10);

        //将4索引上的元素,删除
        array.remove(4);

        //array.clear();

        //使用方法 size+get组合进行遍历
        for(int i = 0 ; i < array.size(); i++){
            System.out.println( array.get(i) );
        }
    }
}