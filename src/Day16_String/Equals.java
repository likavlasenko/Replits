package Day16_String;
//      When compare the value of Strings(the value of text only)
//        returns boolean
public class Equals {
    public static void main(String[] args) {
        String str1 = "Java"; //string pool
        String str2 = new String("Java"); // heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2); //false

        System.out.println(str1.equals(str2));
        System.out.println("=====================================================");

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true
        System.out.println("=====================================================");
        String str5 = "Java";
        String str6 = "Java";

        System.out.println(str4 == str6); // true
        System.out.println(str5.equals(str6)); // true
        System.out.println("=====================================================");
        String str7 = "JAVA";
        String str8 = "java"; // key sensetivity

        System.out.println(str7.equals(str8));


    }
}
