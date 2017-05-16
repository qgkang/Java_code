package code;

public class Operator_4 {
    public static void main(String[] args){
        System.out.println( false & true );//false
        System.out.println( true | true );//true
        System.out.println( false ^ false );//F
        System.out.println( true ^ false );//T
        System.out.println( true ^ true );//F


        System.out.println( !true );//false
        System.out.println( "--------------------------" );
        int i = 3;
        int j = 4;
        System.out.println(3>4 && ++j>2);//falase
        System.out.println(i);//3
        System.out.println(j);//4

        System.out.println(3==3 || ++j>2);//true
        System.out.println(i);//3
        System.out.println(j);//4
    }
}
