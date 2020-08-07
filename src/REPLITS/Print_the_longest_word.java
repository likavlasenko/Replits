package REPLITS;

import java.util.Scanner;

public class Print_the_longest_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first");
        String word1 = scan.next();

        System.out.println("Enter second");
        String word2 = scan.next();

       // char ch1 = word1.charAt(0);

        int l = word1.length();
        int l2 = word2.length();

        if(l>l2){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }


        //System.out.println(l+" ");




    }
}
