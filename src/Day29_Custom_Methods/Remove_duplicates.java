package Day29_Custom_Methods;

public class Remove_duplicates {

    public static void main(String[] args) {
        String str = "ababababababababcccccccddddddddeeeeeee";
//                   ===> "abcde"
        removeDup(str);
    }




    public static void removeDup( String str){ // "abab"

        String nonDup = "";// "ab"
                           //[a, b, a, b]
        for( String each :  str.split("")){
            if(!nonDup.contains(each)){
                nonDup += each;

            }
        }
        System.out.println(nonDup);
    }

}
