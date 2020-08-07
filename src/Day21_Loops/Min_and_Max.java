package Day21_Loops;
/*write a program that asks user to enter 5 numbers and returns minimum and maximum number
 */

import java.util.Scanner;

public class Min_and_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -999999999;
        int min = 999999999;


        for(int i = 1; i <= 5; i++){
            System.out.println("Enter number");
            int num = scan.nextInt();

            if( num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum numner: "+min);




    }
}
