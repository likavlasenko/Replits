package Day12_Switch_Scanner;

public class Bigger_Number {
    /*1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT
*/

    public static void main(String[] args) {
        double n1 = 10000;
        double n2 = 200;
        double n3 = 300;

        boolean n1Bigger = n1 > n2 && n1 > n3;
        boolean n2Bigger = n1Bigger == false && n2 > n3;
                //         n2 > n1 && n2 > n3;
        boolean n3Bigger = n3 > n2 && n3 > n1;
/*
        String result ="";

        if(n1Bigger){
            result = "n1 is bigger";
        }else if(n2 > n1 && n2 > n3){
            result = "n2 is bigger";
        }else { // if n3 is the biggest number
            result = "n3 is bigger";
        }
*/
        String result = (n1Bigger)? "n1 is bigger" :(n2Bigger)? "n2 is bigger" : "n3 is the biggest";
        System.out.println(result);















    }
}
