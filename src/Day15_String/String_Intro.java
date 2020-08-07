package Day15_String;
import java.lang.String;
import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        String str = "Cybertek";
       // Scanner input = new Scanner(System.in);


        String name = "Cybertek";
        String name2 = new String( "Cybertek");

        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println( s1 == s2);

        String d1 = "Dog"; // String literal
        String d2 = "Dog"; // String literal
        System.out.println(d1 == d2);


        String t1 = new String( "Tiger");
        String t2 = new String( "Tiger");
        System.out.println( t1 == t2);
        //          new String ("Tiger") == new String("Tiger") ==> false
        System.out.println("=======================================");

        String c1 = "Cybertek";                     // String pool
        String c2 = new String("Cybertek"); // heap
        //  same visible text, but different locations = different objects ==> false
        String c3 = new String("Cybertek"); // heap
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; // String pool

        System.out.println(c1 == c2);// false
        // "Cybertek" == new String ("Cybertek")

        System.out.println(c2 == c3); // false
        // new String ("Cybertek") == new String("Cybertek")

        System.out.println(c1 == c4);
        //               "Cybertek" == "Cybertek" ==> true

        System.out.println(c4 == c5);
        //               "Cybertek" == "cybertek" ==> false(key senstive)

        System.out.println("========================================");
        String str1 = "Java";
        str1 = "JavaScript";
        System.out.println(str1);

        str1 = "Java";
        System.out.println(str1);
    }
}
