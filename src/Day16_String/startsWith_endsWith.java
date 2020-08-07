package Day16_String;

//startsWith

public class startsWith_endsWith {
    public static void main(String[] args) {
        String s1 = "Lika";
        System.out.println( s1.startsWith("L"));  // true
        System.out.println( s1.startsWith("J"));  // false

        System.out.println( s1.startsWith("Li")); // true

        System.out.println(s1.toLowerCase().contains("li")); // true
        //                           "lika".contains("li")



    }
}
