package Day07_Unari_Shorthand;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2040;
        boolean result = year%4 == 0;
        System.out.println("Year "+year+" is a leap year: "+result);
    }
}
