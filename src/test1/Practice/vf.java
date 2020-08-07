package test1.Practice;

public class vf {
    public static void main(String[] args) {
        String input = "today it will be 100 degrees !";
        int n = 0;
        while (n++ < input.length()) {
            if (n == 8) {
                continue;

            } else if (n == 0) {
                break;
            }

            System.out.print(input.charAt(++n));
        }
    }
}