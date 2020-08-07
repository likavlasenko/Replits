package Day20_WhileLoops;

import java.util.Scanner;

public class While_Loop_Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your password");
        String input = scan.nextLine();

        while( !input.equals(password)){
            System.out.println("Re-enter your password");
        input =  scan.nextLine();

        }
        System.out.println("Logged in.");


    }
}
