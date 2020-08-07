package Office_Hours.June_30_2020;

public class Practice_2 {

    // A, B, C, D, F

    public static void main(String[] args) {
        int score = 80;

        char grade = ' ';
        if(score>= 90 && score <= 100){
            grade = 'A';
        }else if(score >= 80 && score < 90){
            grade = 'B';
        }else if(score >= 70 && score <80){
            grade = 'C';
        }else if(score>= 60 && score <70){
            grade = 'D';
        }else{
            grade= 'F';
        }
        System.out.println(grade);

        char grade2 = (score >= 90 && score <= 100) ? 'A' :(score>= 80)? 'B'
                :(score>=70)? 'C': (score>=60)? 'D': 'F';
        System.out.println(grade2);





    }
}
