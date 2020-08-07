package Day23_Loops_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();

            System.out.println("Enter a math operator");
            char o = input.next().charAt(0);


            switch (o) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid");
            }



/*
            double result = ( o == '+')? num1+num2 : ( o == '-')? num1-num2 : (o == '*')? num1*num2 : (o == '/')?
                    num1/num2 : (o == '%')? num1%num2 : 0;


            System.out.println(result);
*/

                    System.out.println("Do you want to continue?");
                    String a = input.next().toLowerCase();

                    while (!(a.equals("yes") || a.equals("no"))) { // while the answer is invalid
                        System.out.println("Invalid, enter Yes or No");
                        System.out.println("Do you want to continue?");
                        a = input.next().toLowerCase();
                    }
                    if (a.equals("no")) {
                        break;
                    }


            }

        System.out.println("Tank you, Bye Bye!");
        }
        }





