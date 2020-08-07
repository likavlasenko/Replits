package Day32_MethodOverLoading;
/*2. write a return method that accepts two numbers and an operator, then returns calculation result.
        if the oerator is invalid, return zero
        otherwise return the result
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first num");
        double num1 = scan.nextDouble();
        System.out.println("Enter the Operator");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();

        double result = calculator(num1, operator, num2);

        System.out.println("The result is: "+result);

    }


    public static double calculator(double num1, char oper, double num2){
        double result = ( oper == '+')? num1+num2 :(oper == '-')? num1 - num2 :(oper == '*')?
                num1*num2: (oper == '/')? num1/num2 : (oper == '%')? num1%num2 :0;
        return result;
    }
}
