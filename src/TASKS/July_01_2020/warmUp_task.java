package TASKS.July_01_2020;
/*
Warmup tasks:
COMBINE TWO STRINGS:
1. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
  */

import java.util.Scanner;

public class warmUp_task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = "one";
        String str2 = "eight";


        /*
        char ch1 = str1.charAt(str1.length()-1);// last char from str1
        char ch2 = str2.charAt(0);   // first char from str2

        if( ch1 == ch2){
            System.out.println(str1 + str2.substring(1) ); // excluding the first character of the string
        } else{
            System.out.println(str1 + str2);
        }
*/
        String s1 = str1.substring(str1.length() -1,str1.length());
        //                substring(2, 3) ==> e

        String s2 = str2.substring(0,1); // "e"

        if( s1.equals(s2) ){
            System.out.println(str1 + str2.substring(1));
        }else{
            System.out.println(str1 + str2);
        }



    }
}
