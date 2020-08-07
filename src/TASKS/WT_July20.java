package TASKS;

import java.util.Arrays;
import java.util.Scanner;

public class WT_July20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size = scan.nextInt();
        int  arr[] = new int[size];

        for (int i = 0; i <= arr.length-1; i++){
            System.out.println("Enter a number");
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));



    }

    public static void descendingArr(int[]arr){
        Arrays.sort(arr);
        int a = 0;

        for(int i = 0; i <= (arr.length-1)/2; i++){
            arr[i]=a;
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i] = a;
        }
    }
}