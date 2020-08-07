package test1;

public class sample {
    public static void main(String[] args) {
        int cookies = 10;
        String day = "tuesday";
        switch(day){
            case"sun":
                cookies++;

            case"mon":
                cookies += 5;
                break;
            case"tuesday":

            case"wed":
                cookies+=10;
            case"thie":
                cookies+=5;
                break;
            case"fri":
                break;
            case "sar":
                cookies--;
                break;
            default:
                    cookies= 0;
        }




        System.out.println(cookies);
    }
}
