package Day36_ArrayList;
/*
   {30,20,50,15,40}
 */

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Ptactice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(15);
        list.add(20);
        list.add(44);
        list.add(50);

        Collections.sort(list);
        ArrayList<Integer> descendingList = new ArrayList<>();


        for( int i = list.size()-1; i >= 0; i --){
            //System.out.print( list.get(i)+" ");
            descendingList.add(list.get(i));

        }
        System.out.println(descendingList);

    }
}
