package Day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("S");
        students.add("W");
        students.add("B");


        System.out.println("=============================================");

        ArrayList<String> group1 = new ArrayList<>();

        //add all student names in your group
        group1.addAll( Arrays.asList("Muhtar", "Nadir", "Asiya", "Saim"));

        // verify your mentor and one of your closest friend' names are contained in the list
        group1.containsAll(Arrays.asList("Murodil", "Kuzzat"));
    }
}
