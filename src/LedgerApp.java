import java.util.Scanner;

public class LedgerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------Welcome to the Account Ledger App-------------------");
        mainMenu(input);
    }

    public static void mainMenu(Scanner input){
        //app is in action
        boolean running = true;

        //keeps the app running unless they type X to exit and turn off the app
        while (running) {
            //Main Menu options
            System.out.println("Select an option below; type the corresponding letter");
            System.out.println("(D) Add Deposit\n(P) Make Payment (Debit)\n(L) Ledger\n(X) Exit");

            //asks user to type an option they'd like to use
            String userChoice = input.nextLine().toLowerCase().trim();
            //checks which option the user input and opens runs that method, if they input something invalid it
            switch (userChoice.toLowerCase()) {
                case "d": //opens deposit method
                    System.out.println("You chose D");
                    addDeposit(input);
                    break;
                case "p": //opens payment method
                    System.out.println("You chose P");
                    makePayment(input);
                    break;
                case "l": //opens ledger method
                    System.out.println("You chose L");
                    openLedger(input);
                    break;
                case "x": //closes app
                    System.out.println("Thank you for using Account Ledger App");
                    running = false;
                    break;
                default: //asks user to try again if input is invalid
                    System.out.println("Try Again\n");
            }
        }
    }

    //allows the user to deposit money into their account
    public static void addDeposit(Scanner input) {
    }

    //allows the user to submit a payment
    public static void makePayment(Scanner input) {
    }

    //opens the ledger
    public static void openLedger(Scanner input) {
    }
}