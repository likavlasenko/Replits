package Day29_Custom_Methods;

import java.util.Scanner;

public class Methods_WithParameter {

    public static void main(String[] args) {
        printHello(3);
        System.out.println("===================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
        int birthYear = scan.nextInt();
        int currentYear = scan.nextInt();
    }

    public static void printHello(int numberOfTimes){

      for(int i =0; i < numberOfTimes; i++){
          System.out.print("Hello World! ");
      }
    }

    public static void age (int birthYear, int currentYear){

        if(currentYear < birthYear){
            System.out.println("Invalid");
        } else {


            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }
    }

}
