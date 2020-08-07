package Day07_Unari_Shorthand;

public class Divisible_2_3_5 {
    /*
     write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
Collapse
:heavy_check_mark:
9
     */
    public static void main(String[] args) {
        double number = 2040;
        boolean divisibleBy2 = number%2 ==0;
        boolean divisibleBy3 = number%3 ==0;
        boolean divisibleby5 = number%5 ==0;

        System.out.println(number+" is divisible by 2: "+divisibleBy2);
        System.out.println(number+" is divisible by 3: "+divisibleBy3);
        System.out.println(number+" is divisible by 5: "+divisibleby5);




    }
}
