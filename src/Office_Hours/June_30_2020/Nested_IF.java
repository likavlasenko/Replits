package Office_Hours.June_30_2020;

public class Nested_IF {

    // PRE-CONDITION w/ multiple scenarios

    public static void main(String[] args) {
        int score = 80;

        char grade = ' ';

        if (score >= 0 && score <= 100) {


            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 70) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }else {
            grade = 'I';
        }
        System.out.println(grade);

    }
}
