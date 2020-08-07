package Day33_LocalDateTime;

public class Uniques {
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3};

        for( int element : arr ){
            int count = 0;

            for( int b : arr){
                if(element == b){
                    count++;
                }
            }
            if(count == 1){ // if the frequency is one(single) then the element is unique
                System.out.println(element+" ");
            }

        }
        System.out.println();

/*
        int element = arr[0]; //
        int count = 0;
        for( int b : arr){
            if(element == b){
                count++;
            }
        }
        if(count == 1){ // if the frequency is one(single) then the element is unique
            System.out.println(element);
        }
*/

        System.out.println("===================================================");
        int [] n1 = {10,20,30,40,50,60,60,10,20,30,40};
        uniqueElements(n1);
    }

    public static void uniqueElements(int[] arr){
        for( int element : arr ){
            int count = 0;

            for( int b : arr){
                if(element == b){
                    count++;
                }
            }
            if(count == 1){ // if the frequency is one(single) then the element is unique
                System.out.println(element+" ");
            }

        }
        System.out.println();
    }

}
