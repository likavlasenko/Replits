package Day18_For_Loop;
/*
write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

 */

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = scan.next();
        String lastName = scan.next();
// SUBSTRING
        String initials = firstName.substring(0,1) + lastName.substring(0,1);
        initials = initials.toUpperCase(); //

        System.out.println(initials);

        System.out.println("=====================================================");
// CHAR AT()
       char ch1 = firstName.charAt(0);
       char ch2 = lastName.charAt(0);

       String initial = ""+ch1+ch2;
             initial = initial.toUpperCase();

        System.out.println(initial);

    }
}
