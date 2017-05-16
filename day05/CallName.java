package day05;
import java.util.Random;
public class CallName {
    public static void main(String[] args) {
        String[] names = new String[8];
        addStudent(names);
        printStudentName(names);
        String name = randomStudentName(names);
        System.out.println(name);
    }

    public static String randomStudentName(String[] names){
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        return  names[index];
    }

    public static void printStudentName(String[] names){
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }

    public static void addStudent(String[] names){
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "李蕾";
        names[4] = "韩梅梅";
        names[5] = "小名";
        names[6] = "老王";
        names[7] = "小华";
    }

}
