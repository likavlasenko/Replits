package Day16_String;
/*warmup tasks:
    1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */

import java.util.Scanner;

public class SubString_morning_task {
    public static void main(String[] args) {
        // extra task:

        String str = "I Like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String str1 = scan.next(); // Apple
       //                                          ppleanana
        System.out.println("Enter second word");
        String str2 = scan.next(); // Banana

       //String result =  str1.substring(1).concat( str2.substring(1)   );

        String result = str1.substring(1) + str2.substring(1);
        System.out.println(result);





    }
}
