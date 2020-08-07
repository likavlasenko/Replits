package Day18_ForLoop;
/*1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
  2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5


 */
public class Odd_Even {

    public static void main(String[] args) {
        // i: 1 3 5 7 9 11 ...



        for(int i = 1; i <=99; i+=2){

            if( i % 5 ==0 && i % 3 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        for(int i =0; i <=100; i++){
            if( i % 2 !=0) { // pre: i MUST be odd number
                if (i % 5 == 0 && i % 3 == 0) {  // sub: MUST be divisible by 3&5
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("============================================");
        //Task 2 :
        // i: 0 2 4 6 8 10 ....

        for(int i = 0; i <= 100; i += 2){
            if(i % 5 ==0 && i % 3 == 0) {

                System.out.print(i + " ");
            }
        }
        System.out.println();


        for (int i = 0; i <= 100; i++){ // pre: MUST BE EVEN number
            if (i %3 ==0 && i % 5 ==0) { // sub: MUST BE DIVISIBLE by 3 & 5
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }
}
