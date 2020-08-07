package Day20_WhileLoops;

public class System_Exit {
    public static void main(String[] args) {

        if(true){
            System.out.println("Started");
            System.exit(0);
        }
        System.out.println("Done");

        while(true){
            System.out.println("Test started");
            //break;
            System.exit(0);
        }
        //System.out.println("Completed");


    }
}
