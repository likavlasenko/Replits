package Day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // implicit casting: automatically done

        long l2 = (long)s1;

        double d1 = 400.55555;
        int i1 = (int) d1; //400
        System.out.println(i1);

        long L1 = 4400;
        short S1 =(short) L1;
        System.out.println(L1);

        int n1 = 1000;
        byte b1 = (byte)n1;

        System.out.println(b1); // -24

        double m1 = 34.5;
        float f1 =(int) m1;


        long r1 = -500;
        int p1 =(short) r1;






    }



}
