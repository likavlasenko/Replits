package Day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = scan.next();

        System.out.println("Enter second word");
        String second = scan.next();


       /* if(first.equals(second)){
            System.out.println("Equal");
        } else{
            System.out.println("Not Equal");
        }
        */

        //               ( first == second)
        String result = (first.equalsIgnoreCase(second))? "Equal" : "Not equal";

        System.out.println(result);




    }
}
