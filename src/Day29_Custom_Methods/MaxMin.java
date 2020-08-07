package Day29_Custom_Methods;

public class MaxMin {
    public static void maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        System.out.println("Max: "+max);
    }


    public static void minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        System.out.println("Min: "+min);
    }
}
