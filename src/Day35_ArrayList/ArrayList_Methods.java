package Day35_ArrayList;

import java.util.ArrayList;

// SET   CLEAR
public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> earlyBirds  = new ArrayList<>();
        earlyBirds.add("Ibrahim");
        earlyBirds.add("Virginia");
        earlyBirds.add("Sayera");
        earlyBirds.add("Violetta");
        earlyBirds.add("Anzhelika");

        System.out.println(earlyBirds.indexOf("Violetta"));

        earlyBirds.set(0,"Slobodan");
        earlyBirds.set(1,"Adam");
        earlyBirds.clear();


        System.out.println(earlyBirds);
        System.out.println(earlyBirds.size());
        System.out.println("=======================================");

   // remove ( int index )
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add(5);//4

        list.remove(2); //[1,2,4,5]
        //list.remove(4)
        System.out.println(list);

System.out.println("========================================");

    // remove(Element)
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(1);//0
        list2.add(2);//1
        list2.add(3);//2
        list2.add(4);//3
        list2.add(5);//4

        Integer a = 1; // [1,3,4,5]

        list2.remove(a);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Mike");
        list3.add("Alex");
        list3.add("Alissa");
        list3.add("Sonia");
        list3.add("Kyle");

        list3.remove(2);
        list3.remove("Alex");
        System.out.println(list3);

    }
}
