package Day23_Loops_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        String [] students = {"Sayora", "Violetta", "Adam", "Samir"};
        String name1 =  students[1];
        String name3 = students[3];

        System.out.println(name1);
        System.out.println(name3);
        System.out.println("=======================================================");

        String [] names = {"Mike", "Adam","Tonny", "John", "Amy" };
        //                   0        1      2       3        4
        int [] scores= { 85, 70, 95, 90, 100};
/*
        System.out.println( names[0] +" : "+ scores[0]);
        System.out.println( names[1] +" : "+ scores[1]);
        System.out.println( names[2] +" : "+ scores[2]);
        System.out.println( names[3] +" : "+ scores[3]);
        System.out.println( names[4] +" : "+ scores[4]);
*/
        for (int i = 0; i <=4; i++){
            System.out.println( names[i] +" : "+ scores[i]);
        }

    }
}
