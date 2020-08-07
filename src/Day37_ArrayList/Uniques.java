package Day37_ArrayList;


import java.util.ArrayList;
import java.util.Collections;


public class Uniques {
    public static void main(String[] args) {

        String str = "AABBCDAAM";
        String uniques ="";

        ArrayList<String> list = new ArrayList<>();
        for( String each  : str.split("")){
            list.add(each);
        }
        System.out.println(list);
        Collections.frequency(list,"A");

        for( String each :list){

            int count = Collections.frequency(list,each);
            if( count == 1){
                uniques += each;
            }
        }

        System.out.println(uniques);
    }
}
