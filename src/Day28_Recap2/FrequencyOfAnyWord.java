package Day28_Recap2;

public class FrequencyOfAnyWord {
    public static void main(String[] args) {
        String str ="catcatcatcatdogdog";
        //(0, 3)

        int count = 0; // cat
        for( int i = 0; i <= str.length()-3; i++){
                        // String s =    str.substring(i, i+3); OR ==>
        if( str.substring(i,i+3).equalsIgnoreCase("cat")){
            count++;
        }
        }
        System.out.println(count);

    }
}
