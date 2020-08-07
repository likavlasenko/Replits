package Day32_MethodOverLoading;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        String firstName = "anzhelika";
        String lastName = "gorgeouS";
        String fullName;

        fullName = Util.formatFullName(firstName,lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);

        String reversedName = Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("==============================");

        int[]  a= {200,4,67,344,800,500,1000};
        int n = 2500;
        a = Util.addElement(a,n);
        System.out.println(Arrays.toString(a));
    }
}
