package Day10_If_Statements;

public class If_WithoutCurlyBraces {
    public static void main(String[] args) {
        if(9 > 10){ // condition is false
            System.out.println("Hello");
            System.out.println("How are you");
        }
        System.out.println("=========================");

        if( 9 > 10)
            System.out.println("Hello");
            System.out.println("How are you");
    }
}
