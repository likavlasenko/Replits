package Day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(100,90,85,75,55,45,73,77,35,77,47,93,35,83,74,56,68,93,28));
        System.out.println(list);
        System.out.println(list.toString());

        ArrayList<Integer> gradeA = new ArrayList<>(); // 90 ~ 100

        gradeA.addAll(list); // first stores all the grades
        gradeA.removeIf( each -> each < 90 ); // second removes the grades that are not A
         // only retain the grades of A

        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();  // 80 ~ 89
        gradeB.addAll( list ); // first store all the grades
        gradeB.removeIf( p -> p < 80  || p > 89 ); // second remove the grades that are not B  ( F, D, C, A)
        // if the garde is either less than 80 or greater 89 should be removed

        System.out.println("Grade B: "+gradeB);


        ArrayList<Integer> gradeC = new ArrayList<>(); //70 ~ 79
        gradeC.addAll(list); // first store all the grades
        gradeC.removeIf( p -> p < 70 || p > 79 ); // second remove the grades that are not C  ( F, D, B, A)
        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf( p -> p <60 || p > 69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(); // 0 ~ 59
        gradeF.addAll(list);
        gradeF.removeIf( p -> p > 59);

        /*
        gradeF.removeAll( gradeA );
        gradeF.removeAll( gradeB );
        gradeF.removeAll( gradeC );
        gradeF.removeAll( gradeD );
        */

        System.out.println("Grade F: "+gradeF);
    }
}
