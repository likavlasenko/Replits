package Day06_ComparisonOperators;

public class Swap1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = b; // c = 15;

        b = a; // b = 10
        a = b; // a = 10



        System.out.println(a);
        System.out.println(b);

        int q = 100;
        int s = 500;

        int r = s;

        s = q; // 100
        System.out.println(s);
        System.out.println(r);

    }
}
