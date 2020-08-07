package Day34_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {

        String str = "123";
        int a = Integer.parseInt(str);  // ==> 123
        System.out.println(str+1);
        System.out.println(a+1);


        Double d1 = Double.parseDouble("7.5");
     //   double d = 12.5;
        System.out.println(d1-1);

        String s1 = "TRUE";
        boolean b1 = Boolean.parseBoolean(s1); // ignores case sensitivity
        System.out.println(!b1); // to check if it's boolean we apply logical operator
        System.out.println("========================================================");

        String s2 = "100000000.5";
        double d2 = Double.valueOf(s2); // UNBOXING

        System.out.println(d2*2);

        String s3 = "FalSe";
        boolean r2 = Boolean.valueOf(s3); // UNBOXING

        System.out.println(r2);


    }
}
