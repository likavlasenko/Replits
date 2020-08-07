package Day12_Switch_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter your first number:");
            int num1 = sum.nextInt();
        System.out.println("                   ");
        System.out.println("Enter your second number: ");
            int num2 = sum.nextInt();

        System.out.println("Sum of those two numbers: "+(num1 + num2));



    }
}
