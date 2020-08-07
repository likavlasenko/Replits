package TASKS;
/* 3. write a program that asks user to enter two string
            then print the longest string
    4. ask the user to enter two words. then add them together and print
            ex:
                input:
                    one
                    eight
                output:
                    oneeight
                    DO NOT use + operator
                    
 */

import java.util.Scanner;

public class String_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Full Name:");
        String fullName = input.nextLine();

        System.out.println("Enter your Nickname: ");
        String nickName = input.next();

        int long1 = fullName.length();
        int long2 = nickName.length();

        if(long1 > long2) {
            System.out.println(long1+" is longest string.");
        }   else if(long2 > long1){
            System.out.println(long2+" is longest string.");
        }else{
            System.out.println("equal");
        }

        


    }

}
