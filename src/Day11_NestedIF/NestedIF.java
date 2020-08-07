package Day11_NestedIF;

public class NestedIF {
    public static void main(String[] args) {
        int score = 100;

        String result = "";

        if (score >= 0 && score <= 100) { // valid score

            if (score >= 90) {
                result = "A";
            } else if (score >= 80 && score < 90) { // or ( score >= 80)
                result = "B";
            } else if (score >= 70 && score < 80) { // or ( score >= 70)
                result = "C";
            } else if (score >= 60 && score < 70) {
                result = "D";
            } else {
                result = "F";
            }


        } else {     // invalid score
            result = "Invalid";

        }

        System.out.println( result);

    }
}
