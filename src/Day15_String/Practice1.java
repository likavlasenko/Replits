package Day15_String;

import java.util.Scanner;

public class Practice1 {
    // write a program that asks the user first name, last name.
    // print the initials of the full name

    public static void main(String[] args) {
        String name = "Cybertek School";
        //             01234567
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
       String firstName = input.next(); // Cybertek
        char ch1 =   firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = input.next(); // School
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: "+ch1+"."+ch2+".");

        // length() ==> int

         int l =  name.length();
        System.out.println(l);

        //last index: length of String -1
        int lastIndexNumber = name.length() -1;




    }
}
