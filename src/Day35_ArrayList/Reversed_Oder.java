package Day35_ArrayList;
/*
1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1

 */

import java.util.ArrayList;

public class Reversed_Oder {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // 0           autoBoxing
        list.add(20); // 1
       // list.add(1,30); // 2 Can not skip indexes
        list.add(2,30);
        list.add(40); // 3
        list.add(50); // 4

        System.out.println(list);

        for(int i = list.size()-1; i>= 0; i--){
            System.out.print( list.get(i)+" " );
        }




    }

}
