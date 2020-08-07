package Day16_String;

public class String_Methods {
    public static void main(String[] args) {
// replace()
        String email ="cybertek@gmail.com";
       email = email.replace(  "gmail", "yahoo"); //"cybertek@yahoo.com"

        System.out.println(email);

        String word ="java";
        word = word.replace("a", "e"); // "jeve"

        System.out.println(word);

        System.out.println("=======================================================");

        String sentence = "I like to lear Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java" , "a, C#");

        sentence = sentence.replace("Java ", "Python ");

        System.out.println(sentence);


        System.out.println("========================================================");
        String s1 = "I like to stay in Cybertek, Cybertek is nice place"; //MIT

        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT", "Cybertek");
        System.out.println(s1);
        System.out.println("=======================================================");
        String s2 = "I like to leaRn Java, we aRe enjoying Java"; //r
        s2= s2.replace("R", "r");

        System.out.println(s2);
        System.out.println("======================================================");

        String s3 = "I like to drink tea and tea";
        s3.replaceFirst("tea", "cola"); // "I like to drink cola and tea"

        System.out.println(s3);
        System.out.println("========================================================");

        String s4 = "I like to watch Game of Thrones, and Walking dead"; // needed: I like to watch Game of Thrones
        s4 =  s4.replace(", and Walking dead" , ".");

        System.out.println(s4);







    }
}
