package Day07_Unari_Shorthand;

public class Shorthand {
    public static void main(String[] args) {
        int a = 100;
       // a = a * a;
        a *= a;
        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;
        System.out.println(c);
        System.out.println("==================");

        //+=:
        int z = 300;
        z += 200;
        System.out.println(z);
        String schoolName = "Cybertek ";
        schoolName += "School";
        System.out.println(schoolName);

        String fullName = "Anzhelika ";
                fullName += "Vlasenko";
        System.out.println(fullName);
        System.out.println("=======================");

        // /= : division

        int budget = 100000;
            budget /=2;
            budget /=4;
        System.out.println(budget);
        System.out.println("=========================");

        // %= : remainder assignment

        int r = 10;
        r %= 2; //===> a = a % 2;

        int num = 100;
        num %=3;
        System.out.println(num);

        double num2 = 400.5;
               num2 %= 2;
        System.out.println(num2);


    }
}
