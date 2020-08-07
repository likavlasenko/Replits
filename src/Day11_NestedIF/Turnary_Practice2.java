package Day11_NestedIF;

public class Turnary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }

        String result2 = (num > 0)? "Positive" : (num <0) ? "Negative" : "Zero";
        System.out.println(result2);

    }
}
