package Day14_Recap;
/*ask:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )

 */
    import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

    import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);// Enter Enter

        System.out.println("Enter your gender:");
        String gender = input.next();// famaleEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //19

        input.nextLine();//

        System.out.println("Enter your country name: ");
        String countryName = input.nextLine();

        System.out.println("Enter Your zip code: ");
        int zipCode = input.nextInt(); // 12345

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();


    }
}
