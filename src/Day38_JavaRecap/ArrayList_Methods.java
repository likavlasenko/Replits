package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
// remove, size, set, get, equals, contains, clear
public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","WV","Lamborgini","Lexus","Tesla","Tesla","Tesla"));
    //                              0        1       2       3          4       5

//cars.remove(5);
//cars.remove("Tesla");
//cars.removeAll(Arrays.asList("Tesla"));
//cars.removeIf( p -> p.toLowerCase().contains("m"));
//cars.retainAll ( Arrays.asList("Tesla") );
        System.out.println(cars);
        System.out.println("=============================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll( Arrays.asList( "Avocado", "Almond Milk", "Apples", "Spinach", "Celery","Trail Mix") );

        boolean r = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r);

        boolean r2 = groceryList.containsAll( Arrays.asList("Eggs","Apples","Spinach") );
        System.out.println(r2);

        System.out.println("Total number of Items: "+ groceryList.size());

        groceryList.set(groceryList.size()-1, "Blueberries");
        groceryList.set(groceryList.indexOf("Celery"), "Broccoli" );

        System.out.println(groceryList);
        groceryList.clear();
        System.out.println(groceryList);


    }
}
