package day09.demo3;

/**
 * Created by Qingge on 2017/5/17.
 */
public class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean compare(Person p) {
        return this.age == p.age;
    }
}
