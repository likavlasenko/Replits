package Day23_Loops_Arrays;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABABB"; // "A2B2"
        String nonDup = "";  // "AB"
        String result = "";  // "A2B2"

        for(int i = 0; i<= str.length()-1; i++ ){
            String ch = ""+ str.charAt(i); // A, B, A, B

            if(!nonDup.contains(ch)){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);
        // str = "ABAB"    nonDup = "AB"

        char ch = nonDup.charAt(0); //A
        int count = 0;
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == ch){
                count+=1;
            }
        }
        System.out.println(result);

        System.out.println("frequency of A is:" +count);

        result += ""+nonDup.charAt(1) + count;

        char ch2 = nonDup.charAt(1); //A
        int count2 = 0;
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == ch2){
                count2+=1;
            }
        }

        System.out.println("frequency of B is:" +count);

        result += ""+ch2 + count2;


    }

}
