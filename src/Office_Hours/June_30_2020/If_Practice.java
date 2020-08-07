package Office_Hours.June_30_2020;

import java.sql.SQLOutput;

public class If_Practice {
    public static void main(String[] args) {
        int num = 300;

        String result = "";
        if(num % 2 == 0){
           // System.out.println(num+" is even number");
            result = num+" is even number";

        } else {
            //System.out.println(num+" is odd number");
            result = num+" is odd number";
        }
        System.out.println(result);
        System.out.println("==========================================");

        String result2 = (num % 2 == 0) ? num+" is even number" : num+" is odd number";
        System.out.println(result2);


    }
}
