package Day29_Custom_Methods;

public class Method_Without_Parameter2 {
    public static void main(String[] args) {

        printHello5X();
        System.out.print("Cybertek ");
        printHello5X();
        System.out.print("Lika ");
    }

    public static void printHello5X(){
        for(int i = 10; i >= 6; i --){
            System.out.print("Hello ");
        }
    }

}
