import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DmvSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to hell (the DMV*)");
        System.out.println("Press enter to continue...");
        sc.nextLine();

        int userNum = (int)(Math.random()*200);
        System.out.println("Your number is: " + userNum);
        System.out.println("Please wait roughly half your entire lifetime for your number to be called");
        System.out.println("Press enter to continue...");
        sc.nextLine();

        for(int i=userNum+1; i<userNum+201; i++){
            System.out.println("Now servicing number: " + i%200);
            /*
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */
        }

        int miracle = (int)(Math.random()*100);
        if(miracle == 50){
            System.out.println("Your paperwork looks good. You are all set. Have a great day!");
        }
        else{
            System.out.println("Bro you're actually so dumb these aren't the right forms MWAHAHAHHAHA");
        }
    }
}
