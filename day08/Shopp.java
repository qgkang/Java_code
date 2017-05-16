package day08;
import java.util.*;
public class Shopp {
    public static void main(String[] args) {
        ArrayList<FruitItem> array = new ArrayList<FruitItem>();
        init(array);
        while (true){
            mainMenu();
            int choose = chooseFuntion();
            switch (choose){
                case 1:
                    showFruit(array);
                    break;

                case 2:
                    addFruit(array);
                    break;

                case 3:
                    deleteFruit(array);
                    break;

                case 4:
                    updateFruit(array);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("No this Function");
                    break;
            }
        }
    }

    public static void init(ArrayList<FruitItem> array){
        //创建出多个FruitItem类型,并且属性赋值
        FruitItem f1 = new FruitItem();
        f1.ID = 9527;
        f1.name = "少林寺酥饼核桃";
        f1.price = 12.7;

        FruitItem f2 = new FruitItem();
        f2.ID = 9008;
        f2.name = "尚康杂粮牡丹饼";
        f2.price = 5.6;

        FruitItem f3 = new FruitItem();
        f3.ID = 9879;
        f3.name = "新疆原产哈密瓜";
        f3.price = 599.6;

        //创建的3个FruitItem类型变量,存储到集合中
        array.add(f1);
        array.add(f2);
        array.add(f3);
    }
    public static void mainMenu(){
        System.out.println();
        System.out.println("============欢迎光临ItCast超市============");
        System.out.println("1: 货物 清单   2: 添加货物   3: 删除货物   4: 修改货物  5: 退出");
        System.out.println("请您输入要操作的功能序号");
    }
    public static int chooseFuntion(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void showFruit(ArrayList<FruitItem> array){
        System.out.println();
        System.out.println("================商品库存清单================");
        System.out.println("商品编号         商品名称                商品单价");
        for (int i =0; i< array.size();i++){
            FruitItem item = array.get(i);
            System.out.println(item.ID+"   "+item.name+"        "+item.price);
        }
    }
    public static void addFruit(ArrayList<FruitItem> array){
        System.out.println("选择的是添加商品功能");
        //创建Scanner变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品的编号");
        //输入商品的编号
        int ID = sc.nextInt();
        //输入商品的名字
        System.out.println("请输入商品的名字");
        String name = sc.next();
        //输入商品的单价
        System.out.println("输入商品的单价");
        double price = sc.nextDouble();

        FruitItem item = new FruitItem();
        item.ID = ID;
        item.name = name;
        item.price = price;

        array.add(item);
        System.out.println("商品添加成功");

    }
    public static void deleteFruit(ArrayList<FruitItem> array){
        System.out.println("选择的是删除功能");
        System.out.println("请输入商品的编号");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        for(int i = 0;i<array.size();i++){
            FruitItem item = array.get(i);
            if(item.ID == ID){
                array.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("你输入的编号不存在");
    }
    public static void updateFruit(ArrayList<FruitItem> array){
        System.out.println("选择的是修改功能");
        System.out.println("请输入商品的编号");

        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        //遍历集合,获取每个FruitItem变量
        for(int i = 0 ; i < array.size(); i++){
            FruitItem item = array.get(i);
            //获取FruitItem的属性ID,和用户输入的ID比较
            if(item.ID == ID){
                System.out.println("输入新的商品编号");
                item.ID = sc.nextInt();

                System.out.println("输入新的商品名字");
                item.name = sc.next();

                System.out.println("输入新的商品价格");
                item.price = sc.nextDouble();
                System.out.println("商品修改成功");
                return ;
            }
        }
        System.out.println("输入的编号不存在");
    }
}
