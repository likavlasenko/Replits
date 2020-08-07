package Day09_If_Statements;

public class Medium_Number {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;


            boolean aIsMed = (a > b && a < c) || (a < b && a > c);
            boolean bIsMed = (b > c && b < a) || (b < c && b > a);
                           // (c > a && c < b) || (c < a && c > a);

            boolean cIsMed = !aIsMed && !bIsMed;

            double med = 0;
            if(aIsMed){
                med =a;
            }
            if(bIsMed) {
                med = b;
            }
            if(cIsMed) {
                med= c;
            }

        System.out.println(med+" is the Medium Number");


    }
}
