package code;

/*
	实现商品库存清单案例
	  步骤:
	   1. 实现表头, 是固定数据,直接写输出语句 sop
	   2. 表格中间, 商品数据,采用变量形式 定义变量,找对数据类型
	      输出所有变量
	   3. 表格尾巴, 一部分数据固定
	      另一部分吗,商品数据进行数学计算,运算符
*/
public class Shopp {
    public static void main(String[] args) {
        System.out.println("----------商场库存清单----------");
        System.out.println("品牌型号        尺寸     价格     库存数");

        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 8000.55;
        int macCount = 5;

        String thinkBrand = "ThinkPadT450";
        double thinkSize = 14;
        double thinkPrice = 5999.99;
        int    thinkCount = 10;

        String asusBrand = "ASUS-FL5800";
        double asusSize = 15.6;
        double asusPrice = 4999.5;
        int    asusCount = 18;

        System.out.println(macBrand+"    "+macSize+"    "+macPrice+"    "+macCount);
        System.out.println(thinkBrand+"  "+thinkSize+"    "+thinkPrice+"   "+thinkCount);
        System.out.println(asusBrand+"   "+asusSize+"    "+asusPrice+"    "+asusCount);

        int totalCount = macCount+thinkCount+asusCount;

        double totalMoney = macPrice*macCount + thinkCount*thinkPrice+ asusCount*asusPrice;

        System.out.println("总库存数: "+totalCount);
        System.out.println("商品库存总金额: "+totalMoney);
    }
}
