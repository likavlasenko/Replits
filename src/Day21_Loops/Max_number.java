package Day21_Loops;
/*write a program that asks user to enter 5 numbers and retuns the maximum number
 */

import java.util.Scanner;

public class Max_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648; //
        for(int i = 10; i<=50; i += 10){

            System.out.println("Enter a number");
            int num = scan.nextInt(); // whatever user's input is greater, it will be assigned to the max

            if( num> max){
                max = num;
            }
        }

        System.out.println("Max number: "+ max);


    }
}
