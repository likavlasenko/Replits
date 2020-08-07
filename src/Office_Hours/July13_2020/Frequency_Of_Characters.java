package Office_Hours.July13_2020;

public class Frequency_Of_Characters {
    public static void main(String[] args) {

        String str = "OOPQQ"; // "O2P1Q2"
        String nonDup = "";   // "OPQ"

        // TO Remove Duplicates:
        for(int i = 0; i <= str.length()-1; i++ ){
             //        i <= 4
           String s =""+str.charAt(i); // O O P Q Q


            if(!nonDup.contains(s)){ // if the character does not exist then we concate it
                nonDup += s;
            }
            System.out.println(nonDup);


        }



    }

}
