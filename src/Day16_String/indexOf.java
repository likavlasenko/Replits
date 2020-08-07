package Day16_String;
// indexOf()

public class indexOf {
    public static void main(String[] args) {
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");// returns the first char 'r' index (make it unique)
        int r3 = s5.indexOf("rn");// returns the first char 'r' index

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        System.out.println(s5.charAt(r1));
        System.out.println("=============================================================");

//lastIndexOf()
        String s6 = "Java is a programming language, and Java is fun";
        int I1 = s6.indexOf("J");
        int I2 = s6.indexOf(" J")+1;
        int I3 = s6.lastIndexOf("J");

        System.out.println(I1);
        System.out.println(I2);
        System.out.println(I3);

        String s7 = "Java";
        int a1 = s7.indexOf("A"); // doesn't exist

        System.out.println(a1);
        System.out.println("==============================================");

        String s8 = "Java";
        int a = s8.indexOf("a");

        char ch = s8.charAt(a);
        System.out.println(a);




    }
}
