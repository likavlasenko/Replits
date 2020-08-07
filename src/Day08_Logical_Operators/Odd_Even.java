package Day08_Logical_Operators;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println( -1 + -10);
                    // - 1 - 10 ==> -11
        System.out.println(-1 - -10);
        //                 -1 + 10 = 9

        //1. Write a program that can verify if a number is positive, negative, 0
        System.out.println("=======================");

        double number = 0;

        boolean positive = number >0;
        boolean negative = number <0;
        boolean zero = number == 0;

        System.out.println(number+" is positive? "+positive);
        System.out.println(number+" is negative? "+negative);
        System.out.println(number+" is equal to Zero? "+zero);
    }
}
