package Day28_Recap2;

import java.util.Arrays;

public class MultiD_Array_Practice3 {
    public static void main(String[] args) {
        int [] [] arr2D = { {1,2,3}, {4,5} };

        int [][][] arr3D = { {{1,2,3}, {4,5}}, {{6,7,8}, {9,10}}   };
        //                           0                 1
        System.out.println(Arrays.deepToString(arr3D));

        // {{6,7,8}, {9,10}}
        System.out.println(  Arrays.deepToString(arr3D[1]));

        //{4,5}
        System.out.println( arr3D[0][1]);




    }
}
