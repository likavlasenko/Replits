package Day15_String;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 012345678910


        // substring(beg index, end index)
        String word = sentence.substring(0 ,4);
        System.out.println(word);

        String word2 = sentence.substring(8,11);
        System.out.println(word2);

        System.out.println("============================");
        //String word3 = sentence.toUpperCase();
        //System.out.println(word3);

        String sentence2 =  "I like Movies and TV Series";
        //                   0123456789101112...

        String word3 = sentence2.substring(7, 13);
        System.out.println(word3);

        System.out.println("===============================");

        String firstName = "LIKA";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length() ); //firstName.length(): lastIndex + 1

        firstName = firstCharacter.toUpperCase() +rest.toLowerCase();

        System.out.println(firstCharacter);
        System.out.println(rest);
        System.out.println(firstName);
        System.out.println("===============================");

        String lastName = "cYNThiA";
        String firstChar = lastName.substring(0,1); //s
        String remaining = lastName.substring(1);  //chool

        lastName = firstChar.toUpperCase() + remaining.toLowerCase(); //School

        System.out.println(firstChar);
        System.out.println(lastName);
        System.out.println("================================");


        String s = "I like Game Of Thrones"; // Game
        //          01234567
        String series = s.substring(7,11);

        System.out.println(series);

        String s2 = "I like Java Programming Language";
        //           01234567
        String language = s2.substring(7);
        System.out.println(language);

    }
}
