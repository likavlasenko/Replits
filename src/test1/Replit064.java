package test1;

import java.util.Scanner;

public class Replit064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        //YOUR CODE HERE

        int l = word.length();
        if(l >= 3 && l %2 !=0) {
            System.out.println(word.charAt(l / 2));
        }else if (l == 1) {
            System.out.println(word + word + word);
        }else if( l % 2 == 0 && l >=4) {
            System.out.println(word.charAt((l / 2) - 1));
            System.out.println(word.charAt(1 / 2));
        }else if(l == 2) {
            System.out.println(word + word);
        }


        }
}
