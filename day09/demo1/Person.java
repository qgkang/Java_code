package day09.demo1;

public class Person {
    String name;
    private int age;

    public void setAge(int a){
        if(a<0||a>200){
            age = 20;
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }

    public void speak(){
        System.out.println(name +"........."+age);
    }
}
