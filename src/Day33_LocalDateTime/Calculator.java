package Day33_LocalDateTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Calculator {
/*Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
*/
public static void main(String[] args) {

    int a = 10;
    double b = 20;
    System.out.println( addition(a, (int)b) ); // normally don't do casting, no need


    float num1 = 10;
    float num2 = 9;
    System.out.println( addition(num1,num2) );

    System.out.println(addition(90, 5.5));

    System.out.println(addition(10,30));

    System.out.println(addition(0.5,2));

    int arr1 [] = {3,4,1,1};
    Arrays.sort(arr1);

    char arr2 [] = {'B','C', 'A'};
    Arrays.sort(arr2);

    System.out.println("Cybertek");
    System.out.println('A');
    System.out.println(123);
    System.out.println(12.5);

    long l1 = 100500;
    long l2 = 105050;
    System.out.println(multiplication(l1,l2));


}




    public static int addition(int a, int b){
        return a+b;
    }

    public static double addition(double a, double b){
        return a+b;
    }

    public static double addition(double a,int b){
    return a+b;
    }

    public static int multiplication(int a, int b){
    return a*b;
    }

    public static double multiplication(double a, double b){
      return  a*b;
    }


}
