package day09.demo4;
import java.util.*;
public class CallName {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        addStudent(list);
        printStudent(list);
        randomStudent(list);
    }

    public static void addStudent(ArrayList<Student> list){
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("kang");

        Student s2 = new Student();
        s2.setName("lisi2");
        s2.setAge(152);

        Student s3 = new Student();
        s3.setName("lisi3");
        s3.setAge(153);

        Student s4 = new Student();
        s4.setName("lisi4");
        s4.setAge(154);

        Student s5 = new Student();
        s5.setName("lisi5");
        s5.setAge(155);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
    }

    public static void printStudent(ArrayList<Student> list){
        for(int i =0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+"......"+s.getAge());
        }
    }

    public static void randomStudent(ArrayList<Student> list){
        Random ran = new Random();
        int index = ran.nextInt(list.size());
        Student s= list.get(index);
        System.out.println(s.getName());
    }
}
