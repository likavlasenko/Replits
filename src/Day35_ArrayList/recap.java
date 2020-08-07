package Day35_ArrayList;

import java.util.ArrayList;

public class recap {
    public static void main(String[] args) {

     String str = "a1b2c3";
     int sum = 0;

     for (int i = 0; i <= str.length()-1; i++){
          char each = str.charAt(i); // a,1,b,2,c,3

         if(each >= 48 && each <= 57){ // if the char is beyween 48~57, then it's digit

         sum +=  Integer.parseInt(""+each);
         }
        }


    }
}
