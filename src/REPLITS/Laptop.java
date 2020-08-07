package REPLITS;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenType=scan.nextLine();

        System.out.println("Select CPU type:");
        String cpu=scan.nextLine();

        System.out.println("Select RAM size:");
        int ram = scan.nextInt();

        System.out.println("Select storage type:");
        String storageType = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter memory size:");
        int memory = scan.nextInt();

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        scan.nextLine();

        int scrPrice =0;
        switch (screenType){
            case "13.3" :
                scrPrice=200;
                break;
            case "15.0" :
                scrPrice=300;
                break;
            case "17.3" :
                scrPrice=400;
                break;

        }
        System.out.println("Screen Price: "+scrPrice);

        int cpuPrice=0;
        switch (cpu){
            case "i3" :
                cpuPrice=150;
                break;
            case "i5" :
                cpuPrice=250;
                break;
            case "i7" :
                cpuPrice=350;
                break;

        }
        System.out.println("CPU Price: "+cpuPrice);

        int ramPrice=0;
        if (ram>4){
            for (int i=4 ; i<=ram; i+=4){
                ramPrice+=50;
            }
            System.out.println ("Ram Price: "+ramPrice);

        }

        int storagePrice=0;

        if ( storageType.equals("HDD")){
            for (int i=500 ; i<=memory; i+=500){
                storagePrice += 50;
            }
            System.out.println ("Storage Price: "+storagePrice);

        }else
            for (int i = 500; i <= memory; i += 500) {
                storagePrice += 100;
            }
        System.out.println("Storage Price: "+storagePrice);


        int resPrice = 0;

        if (resolution.equals("4K")) {
            resPrice+=200;
            System.out.println("Resolution Price: "+ 200);
        } else {
            System.out.println("Resolution Price: "+ 100);
            resPrice+=100;
        }
        double price = scrPrice + cpuPrice + ramPrice + storagePrice+resPrice;

        System.out.println("Laptop price is: $" + price);


    }
}
