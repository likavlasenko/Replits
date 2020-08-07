package Day06_ComparisonOperators;

public class Relational_Operators {
    public static void main(String[] args) {
        boolean r1 = 10>9;
        System.out.println(r1);

        boolean r2 = 100 <9000;
        System.out.println(r2);
         boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877<= 878;
        System.out.println(r4);

        boolean r5 = 200 <=300;
        System.out.println(r5);

        boolean r6 = 900 == 800;
        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "bad" == "bad";
        System.out.println(r8);

        boolean r9 = "lika" == "lika";

        boolean r10 = "Muhtar" != "Bad Guy";
        System.out.println(r10);

        boolean result1 = 'A' == 65;
        System.out.println(result1);

        boolean result2 = 100 == 100.0; //$100 $100.0 = equal
        System.out.println(result2);

        boolean result3 = 10 == 10.999999999999;
        System.out.println(result3);

        int number = 100;
        boolean even = number%2 ==0;
        System.out.println(even);

        int x = 1000;
        // odd: x % 2!= 0               ===> false
        // even: x % 2 == 0             ===> true
        // divisible by 3: x % == 0     ===> false
        // divisible by 5: x % 5 ==0    ===> true
        // divisible by 10: x % 10 ==0  ===> true




    }

}
