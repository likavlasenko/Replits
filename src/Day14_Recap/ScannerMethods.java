package Day14_Recap;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //    int num = input.nextInt();
        // double num = input.nextDouble();
        // boolean num = input.nextBoolean();

        System.out.println("Your word: ");

        //String num = input.next();
        //        "I'm fuken good at Java";

        String num = input.nextLine();

        System.out.println("You have entered: "+num+".");

        System.out.println("Done!");
    }
}
