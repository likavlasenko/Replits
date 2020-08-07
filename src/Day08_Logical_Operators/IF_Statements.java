package Day08_Logical_Operators;

public class IF_Statements {
    /*
    // single IF: conditions
    //  if(Boolean){
    //    codes (statements);
    //  }
    //  If boolean is true : codes in IF statement gets executed
    // If boolean is false : codes in if statement WILL NEVER get executed;

     */
    public static void main(String[] args) {
        int a = 2000;
        int b = 2000;

        if (a > b) {
            System.out.println(a+" is the max number");
        }
        if ( b > a) {
            System.out.println(b+" is the max number");
        }
        if (a == b){
            System.out.println("Both are equal");
        }
        System.out.println("===============================");

        boolean breakTime = false;
        if(breakTime == true){
            System.out.println("Take 15 minutes break!");
        }
        if(breakTime == false){
            System.out.println("Keep Studying");
        }
        System.out.println("==============================");

    }
}
