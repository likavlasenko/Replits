package Day16_String;

public class contains {
    public static void main(String[] args) {
        // contains:
        String str = "I like to learn java programming language";
        System.out.println(str.contains("python"));  //false
        System.out.println(!str.contains("python")); // true

        System.out.println(str.contains("java"));   // true
        System.out.println(str.contains("JAV"));    // false



    }
}
