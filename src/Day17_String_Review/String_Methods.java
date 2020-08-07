package Day17_String_Review;

public class String_Methods {
    /*
String methods: charAt, +, length(), upperCase, lowerCase, trim, substring, replace, replaceFirst, indexOf,
    lastIndexOf, equals, equalsIgnorecase, isEmpty, ends, starts, contains
     */
    public static void main(String[] args) {

// charAt(index); ==> char

     String str = "Cybertek";
     // index:     01234567
          char ch1 = str.charAt(1);
        System.out.println(ch1);

// +

     String str2 = "Cybertek";
            str2 = str2 + " School";
        System.out.println(str2);

// length(); (count starts from 1)  returns number as integer ==> int
        String str3 = "Cybertek";
        //             01234567
              int l = str3.length();
        System.out.println("length: "+l);

        // lastindex: length -1
           char ch2 =  str3.charAt(l -1); // str3.length()-1 ==? 15 -1 ==>14
        System.out.println(ch2);
        System.out.println("last index is "+(l-1));

// upperCase & lowerCase
        String str4 = "cybertek";
               str4 = str4.toUpperCase(); // "CYBERTEK"

        System.out.println(str4);

        String str5 = "JAVA";
               str5 = str5.toLowerCase();// "java"

        System.out.println(str5);

// trim()

        String str6 = "     Cybertek    "; // only the space before words and quotations will be removed.not between the words.
               str6 = str6.trim(); //"Cybertek"

        System.out.println(str6);

// substring()    ==> String

        String str7 = "I Like Java Language"; // Java + 1
        //             012345678910
        String word = str7.substring(7,11);
        System.out.println(word);

        String word2 = str7.substring(12);
        String word3 = str7.substring(12, str7.length()-1 +1);
        System.out.println(word2);
        System.out.println(word3);

// indexOf & lastIndexOf ==> int
        String str8 = "Hello Batch 20, Have a Wonderful day, We happy to see you";

        int i1 = str8.indexOf("W");
        System.out.println(i1);

        System.out.println(   str8.charAt(i1));

        int i2 = str8.indexOf("We"); // make it unique: add the next character OR
        int i3 = str8.indexOf(", W") +2 ;// make it unique: specify the order num of needed index

        System.out.println(i2);
        System.out.println(i3);

        String str9 = "Java Java Java";
             int i4 = str9.lastIndexOf("J");
             int i5 = str9.indexOf("Java");
             int i6 = str9.indexOf(" Java ")+1;
             int i7 = str9.lastIndexOf("Java ");
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);


// replace & replaceFirst
        String s1= "I like Java, Java is programming language";
        s1 = s1.replace("Java", "C#");//"...."
        System.out.println(s1);

        String s2 = "I like Java, Java is programming language";
        s2 = s2.replaceFirst("Java", "C#");

        System.out.println(s2);

        String s3 = "I like Java, Java is programming language";
        s3 = s3.replace( "Java is", "C# is");

        System.out.println(s3);




    }
}
