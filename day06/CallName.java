package day06;
import java.util.*;
public class CallName {
    public static void main(String[] args) {
        ArrayList<StudentName> array = new ArrayList<StudentName>();
        add(array);
        printArrayList(array);
        randomStudentName(array);
    }

    public static void randomStudentName(ArrayList<StudentName> array){
        Random r = new Random();
        int number = r.nextInt(array.size());
        StudentName s = array.get(number);
        System.out.println(s.name +"  "+s.age);
    }

    public static void printArrayList(ArrayList<StudentName> array){
        for(int i =0;i<array.size();i++){
            StudentName s = array.get(i);
            System.out.println(s.name+"  "+s.age);
        }
    }

    public static void add(ArrayList<StudentName> array){
        StudentName sn1 = new StudentName();
        StudentName sn2 = new StudentName();
        StudentName sn3 = new StudentName();
        StudentName sn4 = new StudentName();
        StudentName sn5 = new StudentName();

        sn1.name = "张三1";
        sn1.age = 201;

        sn2.name = "张三2";
        sn2.age = 202;

        sn3.name = "张三3";
        sn3.age = 203;

        sn4.name = "张三4";
        sn4.age = 204;

        sn5.name = "张三5";
        sn5.age = 205;

        array.add(sn1);
        array.add(sn2);
        array.add(sn3);
        array.add(sn4);
        array.add(sn5);
    }
}
