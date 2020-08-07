package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(77);
        list.add(809);
        list.add(808);

        Collections.sort(list);

        System.out.println(list);
        System.out.println("Maximum number: "+list.get( list.size()-1) );
        System.out.println("Minimum number: "+list.get(0) );

        System.out.println("===============================================");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        Collections.swap(list2,1,2);
        System.out.println(list2);

        Collections.swap(list2, list2.size()-1,0);
        System.out.println(list2);
        System.out.println("==========================================================");

        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('V');
        charList.add('V');
        charList.add('A');
        charList.add('V');

      int count =  Collections.frequency(charList, 'A');
        System.out.println(count);





    }
}
