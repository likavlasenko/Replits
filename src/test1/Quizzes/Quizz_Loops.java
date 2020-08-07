package test1.Quizzes;

public class Quizz_Loops {
    public static void main(String[] args) {

        String str = "Cybertek";
        String str2 = str.concat(" School");

        String str3 = str2.toLowerCase();
        System.out.println(str3);

        System.out.println("===============================");

        for(int i = 0; i <= 4;){
            i++;
            System.out.print(i);
        }
        System.out.println();

        System.out.println("=========================");

        int k = 0;
        int j =7;

        for(k = 0; k <j-1; k+=2){
            System.out.print(k+"");
        }



    }
}
