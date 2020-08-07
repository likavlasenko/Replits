package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));

        //Predicate<Integer> lessThan5 = p -> p <5;

        list.removeIf( p -> p < 5 );

        System.out.println(list);
        System.out.println("================================================");

        Predicate<Integer> oddNumbers = p -> p%2 != 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i =0; i <= 100; i++){
            numbers.add(i);
        }




    }
}
