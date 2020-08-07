package Day23_Loops_Arrays;
/*
 2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */

import java.util.Scanner;

public class CybertekInn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");

        while(true){
            System.out.println("What room would you like to reserve?");
            String room1 = "King Bed";
            String room2 = "Queen Bed";
            String room3 = "Single Bed";

            String choice = scan.nextLine();

            switch (choice) {
                case "King Bed":
                    System.out.println("You have to pay $120");
                    break;
                case "Queen Bed":
                    System.out.println("You have yo pay $100");
                    break;
                case "Single Bed":
                    System.out.println("You have to pay $80");
                    break;
                default:
                    System.out.println("Invalid");
            }

            System.out.println("Do you want to reserve another room?");
            String a = scan.next();










            }







        }

    }

