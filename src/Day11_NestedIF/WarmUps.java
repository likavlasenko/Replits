package Day11_NestedIF;

public class WarmUps {
    public static void main(String[] args) {
        /*warmup task:
        1. write a java program that can convert numbers between 0 ~ 9 to words,
         if the number is greater than 9 or less than zero, out put should be "Invalid".
*/

       int num = 4;
       String result = "";

       if(num ==0){
           result = "zero";
       } else if(num ==1){
           result = "one";
       } else if(num==2){
           result = "two";
       } else if(num==3){
           result = "3";
       } else if(num==4){
           result = "4";
       } else if(num==5){
           result = "5";
       } else if(num <0 || num >5){
           result= "invalid";
       }

        System.out.println(result);
    }
}
