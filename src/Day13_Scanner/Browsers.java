package Day13_Scanner;
/* write a program that can display the selected browser
            1.1  declear a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternar

 */
public class Browsers {
    public static void main(String[] args) {
        String browserName = "Firefox";

        switch(browserName){
            case "Chrome":
                System.out.println("Open Chrome Browser");
                break;

            case "Firefox":
                System.out.println("Open Firefox");
                break;

            case"Opera":
                System.out.println("Open Opera");
                break;

            case "Safari":
                System.out.println("Open Safari");
                break;

            case "Edge":
                System.out.println("Open Edge");
                break;

            default:
                System.out.println("Invalid");
                break;
        }


    }
}
