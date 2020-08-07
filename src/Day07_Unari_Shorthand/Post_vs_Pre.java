package Day07_Unari_Shorthand;

public class Post_vs_Pre {
    public static void main(String[] args) {
        int x = 8;
        int y = x--;
        System.out.println(y);
        System.out.println(x);
        System.out.println("====================");

        int a = 50;

        a = --a + a++ + a-- + a++; //49+1=50=>49=>50
        // a =   49 + 49 + 50 + 49;
        // a= 197
        System.out.println(a);



    }
}

