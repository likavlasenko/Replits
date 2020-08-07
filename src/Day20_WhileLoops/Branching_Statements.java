package Day20_WhileLoops;

public class Branching_Statements {
    public static void main(String[] args) {
        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue; // skips everything even the iterator
            }
            System.out.println(ch);

            ch++;

        }
    }
}
