package Basics_of_DSA;

public class Bitwise_Main {

    public static void main(String[] args) {
        int a=3, b=6;
        //Bitwise AND Operation
        System.out.println(a&b);

        //Bitwise AND Operation
        System.out.println(a|b);

        //Bitwise NOT
        System.out.println(~a);

        //Left shift
        System.out.println(a<<30);

        //Right Shift
        System.out.print(a>>1);
        System.out.println();

        System.out.println("TO check whether Kth Bit is Set or Not");
        System.out.println(Bitwise.isKthBitSet(8,2));

    }

}
