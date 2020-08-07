package Day30_CustomMethods;

import java.util.Arrays;

public class WarmUp_Tasks {

    public static void main(String[] args) {
        maxNum(34,43);

        int[] arr = {4,7,87,1,-1,-12,-44,44,65};
        printDesc(arr);

        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7,8};
        combine2Arrays(a1, a2);

        PosNegZero(7);
        System.out.println("===========================");
        int[] a3 = {100,-100,-200,-300,0,900,5000};
        for(int each : a3){
            PosNegZero(each);
        }
    }



//   1. create a function that can print out the maximum number between two numbers
    public static void maxNum(int a, int b){
        if( a == b){
            System.out.println("Equal");
            return; //exits the method
        }
        if(a>=b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }

    }


//  2. create a function that can print out the array of integers in descending order
    public static void printDesc (int[] arr){ // {10,9,20,30,5,6,7};
        Arrays.sort(arr);// 5,6,7,9,10,20,30

        for( int i = arr.length-1; i >=0; i--){
            System.out.print(  arr[i]+" "); // 30 20 10 9 7 6 5

        }
        System.out.println();

    }


//   3. create a function that can print out the combination of two integer arrays
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[ arr1.length + arr2.length];
        int i = 0;
        for( int each : arr1  ){
          arr3[i] = each;
          i++;
        }
        for( int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

/*
4. step1: create a function that can check if the given integer is positive, negative or zero
   step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */

    public static void PosNegZero (int num){
        if(num > 0){
            System.out.println(num+" is positive");
        }else if(num < 0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }
}
