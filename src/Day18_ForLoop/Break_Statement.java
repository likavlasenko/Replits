package Day18_ForLoop;

public class Break_Statement {
    public static void main(String[] args) {
        for( int i = 0; i < 5; i++){
            System.out.println("Hello");
            break;
        }
        System.out.println("==================================");

        for(char ch = 'A'; ch <= 'H'; ch++){
            System.out.print(ch+ " ");
            if (ch == 'C'){
                break;
            }

        }

    }
}
