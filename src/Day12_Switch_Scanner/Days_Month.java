package Day12_Switch_Scanner;

public class Days_Month {
    public static void main(String[] args) {
      int month = 11;
      switch(month){

          case 4:
          case 6:
          case 9:
          case 11:
              System.out.println("30 Days");
              break;

          case 2:
              System.out.println("28 Days");
              break;

          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
              System.out.println("31 Days");
              break;

          default:
              System.out.println("Invalid");

      }
    }
}
