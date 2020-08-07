package Day08_Logical_Operators;

public class WarmUps {
    /*
    warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

     */
    public static void main(String[] args) {
        double gallons = 15;
        double litters = gallons * 3.785;
        System.out.println(gallons+" gallons equal to "+(int)litters+" litters");

        /* warmup task:

    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
        */
        double litter = 200;
        double gallon = litter/3.785;
        System.out.println((int)litters +" liters equal to "+(int)gallons+" gallons");

        /*warmup task:

        3. manually calculate the following code fragements:
              1. int a = 200;
                   int b = -a++ + - --a * a-- % 2
                   b = ?
              2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

         */
        int a = 200; // a = 201
        int b = -a++ + - --a * a -- % 2;
       /*
        // b = - 200 - 200 * 200 % 2
        // b = - 200 - 40000 % 2
        // b = - 200 - 0 = - 200;

        */

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        // z = 300 + 400 - 120000 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400(0.75)


    }
}
