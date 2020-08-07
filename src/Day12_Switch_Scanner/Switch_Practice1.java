package Day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
        int num =1;
        switch(num){

            case 5:
                System.out.println("Friday");
                break;
            case 1:
                System.out.println("Monday");

            case 6:
                System.out.println("Saturday");
                 break;
            case 7:
                System.out.println("Sunday");
            case 4:
                System.out.println("Thursday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("Invalid");
        }

    }
}
