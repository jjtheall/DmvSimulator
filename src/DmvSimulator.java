import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DmvSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to hell (the DMV*)");
        System.out.println("Press enter to continue...");
        sc.nextLine();

        int userNum = (int)(Math.random()*100);
        System.out.println("Your number is: " + userNum);
        System.out.println("Please wait roughly half your entire lifetime for your number to be called");
        System.out.println("Press enter to continue...");
        sc.nextLine();

        for(int i=userNum+1; i<userNum+101; i++){
            System.out.println("Now servicing number: " + i%100);
            /*
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
        }

        System.out.println("I'm sorry but it looks like you do not have all required paperwork");
    }
}
