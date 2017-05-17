package day09.demo1;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(50);
        p.name = "kang";
        p.speak();
        System.out.println(p.getAge());
    }
}
