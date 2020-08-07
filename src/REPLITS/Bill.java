package REPLITS;


    import com.sun.tools.javac.util.StringUtils;

    import java.util.*;

    public class Bill {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE

            Scanner scan = new Scanner(System.in);
            String split = scan.next();
            int numberOfPpl = scan.nextInt();
            float total = scan.nextFloat();
            String quality = scan.next();

            //int numberOfPeople = people.length();

            // people
            String personSym = "&";

            String pplSym ="";
            int index = 0;
            while(index < numberOfPpl) {
                pplSym=pplSym+"&";
                index++;
            }
            System.out.println("Number of people entered: "+pplSym);

            float tipAmount = 0;
            float tipPercentage = 0f;
            float totalBill = 0;

            if(quality == "Poor"){
                tipPercentage = 0.05f;

            }else if ( quality == "Fair"){
                tipPercentage = 0.10f;
            }else if ( quality == "Good"){
                tipPercentage = 0.15f;
            }else if (quality == "Great"){
                tipPercentage = 0.20f;
            }else if ( quality == "Excellent"){
                tipPercentage = 0.25f;
            }

            tipAmount = total * tipPercentage;

            totalBill= total + tipAmount;


            System.out.println("Total to pay: "+totalBill );
        }
    }

