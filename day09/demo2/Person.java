package day09.demo2;
public class Person {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void speak(){
        String name = "hahha";
        int age = 16;
        System.out.println(name+"........."+age);
        //this.name代表的是当前对象的name
        System.out.println(this.name+"........."+this.age);
    }
}
