package Day24_Arrays;
/*
write a program that can find the unique characters from a String
        Ex:
            input: aabcc
            output: b
 */

public class Uniques_2 {
    public static void main(String[] args) {

        String str ="aabcc";

        String expectedResult = "";



        for(int j = 0; j <= str.length()-1; j++){ // because we need the frequency of evry single character

            char ch1 = str.charAt(j); // a a b c c
            int count1 = 0; // 1+1  // frequency of ch
            for(int i = 0; i <= str.length()-1; i++){  // used for finding the frequency of ch and assign it to count
                char each = str.charAt(i);  // a  a  b  c  c
                if(ch1 == each){
                    count1+=1;
                }
            }

            if(count1 == 1 ){ // if it only occurred one time
                expectedResult += ch1;
            }

        }

        System.out.println(expectedResult);

    }
}
