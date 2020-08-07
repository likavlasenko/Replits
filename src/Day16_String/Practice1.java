package Day16_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed?");
        String answer = scan.next(); // or  = scan.next().toLowerCase();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
        }else{
            System.out.println("Not employed");
        }




    }
}
