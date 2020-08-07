package REPLITS;

import java.util.Scanner;

public class ShoppingList030 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String item1, item2, item3;
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
         item1 = scan.next();
         price1 = scan.nextDouble();
         count1 = scan.nextInt();
        System.out.println("Item1 is "+item1+",count is"+count1+", price is "+price1);

        System.out.println("Enter Item2, count and its price:");
         item2 = scan.next();
         price2 = scan.nextDouble();
         count2 = scan.nextInt();
        System.out.println("Item2 is "+item2+",count is"+count2+", price is "+price2);

        System.out.println("Enter Item3, count and its price:");
         item3 = scan.next();
         price3 = scan.nextDouble();
         count3 = scan.nextInt();
        System.out.println("Item3 is "+item3+",count is"+count3+", price is "+price3);

        //double totalPrice = price1+price2+price3;

String report = "";

        if(count1 > 0){
             report ="Item1: "+item1+" Price: "+(count1*price1);
        }else if( count2 >0 ) {
            report += "Item2: " + item2 + " Price: " + (count2 * price2);
        }else if ( count3 >0){
             report +="Item3: "+item3+" Price: "+(count3*price3);
        }

        System.out.println(report);
    }
}
