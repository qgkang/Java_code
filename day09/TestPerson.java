package day09;
public class TestPerson {
    public static void main(String[] args) {
        int a = 1;
        function(a);
        System.out.println(a);//1

        Person p = new Person();
        p.name = "zhagn san";
        System.out.println(p.name);//zhang san

        function(p);
        //main中的p和方法中的p保存的地址是一样的，是引用数据类型
        System.out.println(p.name);//李四
    }

    public static void function(Person p){
        p.name = "李四";
    }

    public static void function(int a){
        a = a+5;
    }
}
