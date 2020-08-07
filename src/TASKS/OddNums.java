package TASKS;

public class OddNums {
    public static void main(String[] args) {
        oddNums();
        System.out.println("=========");
        evenNums();

    }

    public static void oddNums(){

       for(int i = 1; i <= 100; i+=2){
           System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void evenNums(){
        for(int i = 2; i <= 100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
