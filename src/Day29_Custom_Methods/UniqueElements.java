package Day29_Custom_Methods;

public class UniqueElements {

    public static void main(String[] args) {
        String[] arr = {"A", "A", "B", "C", "C"};
        uniques(arr);

        System.out.println("Hello");

        String [] arr2 = {"D", "D", "E", "E", "F"};
    }

    public static void uniques( String[] arr){
        for( String a : arr){ // gets each of the element

            int count = 0;

            for( String each  : arr  ){ // gets the frequency of the methd
                if( a.equals(each) ){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(a);
            }
        }



    }
}
