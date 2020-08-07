package Day13_Scanner;
import java.util.Scanner;

public class Salary_After_Tax {
    public static void main(String[] args) {

        /*write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int salary =     input.nextInt(); // 100000
        System.out.println("Enter your state tax rate: ");
        double stateTaxRate = input.nextDouble(); // 0.08
        double stateTax = salary * stateTaxRate;

        System.out.println("Enter your federal tax rate: ");
        double federalTaxRate = input.nextDouble(); // 0.2
        double federalTax = salary * federalTaxRate;

        double salaryAfterTax = salary - stateTax - federalTax;
        System.out.println("Your salary: &"+salary);
        System.out.println("Your state tax: $"+stateTax);
        System.out.println("Your federal tax: $"+federalTax);
        System.out.println("Your salary after tax: $"+salaryAfterTax);




    }
}
