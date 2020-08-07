package Day30_CustomMethods;

import Library.Util;

public class Method_Call {
    public static void main(String[] args) {

        String str = "aaaabbbbbbbcccc";

        String str2= Util.removeDup(str);
        System.out.println(str2);

        String str3 = Util.reverse(str2);
        System.out.println(str3);



    }



}
