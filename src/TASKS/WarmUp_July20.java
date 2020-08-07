package TASKS;

public class WarmUp_July20 {

    public static void max (double a, double b) {
        if ( a>b ){
            System.out.println(a+" is max");
        }else if(b>a){
            System.out.println(b+" is max");
        }else {
            System.out.println(a+" equals "+b);
        }
    }

    public static void main(String[] args) {

        double num1 = 598;
        double num2 = 59878;
        max(num1,num2);
        System.out.println();
    }


}

