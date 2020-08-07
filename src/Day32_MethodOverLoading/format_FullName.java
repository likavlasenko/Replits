package Day32_MethodOverLoading;
/*
1. write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"

 */

import java.util.Scanner;

public class format_FullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String last = scan.nextLine();
/*
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        //Convers first character to Upper case  // Converts the rest of the chars to lowers

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName= first+" "+last;

        System.out.println(first);
        System.out.println(last);
        System.out.println(fullName);
    }
*/

        String fullName = formatFullName(first, last);
    }

    public static String formatFullName(String first, String last){
        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName= first+" "+last;

        return fullName;
    }
}
