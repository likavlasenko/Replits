package Day28_Recap2;

import java.util.Scanner;

public class Fruequency_Of_Word_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String word =scan.next();
        int l = word.length();

        int count = 0;
        for(int i= 0; i <= str.length()-l; i++){
            if( str.substring(i,i+l).equalsIgnoreCase(word)  ){
                count++;
            }
        }

        System.out.println(count);
    }
}
