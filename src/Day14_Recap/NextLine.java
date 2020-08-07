package Day14_Recap;
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Full Name");
        String fullName = input.nextLine();


    }
}
