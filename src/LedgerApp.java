import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class LedgerApp {
    static List<UserTransactions> allUserTransactions = new ArrayList<>();
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
    public static void addDeposit(Scanner input){
        boolean depositRunning = true;


        while (depositRunning) {


            System.out.println("Would you like to deposit?\nChoose: (Y) Continue or (N) Go back to main menu");
            String yOrN = input.nextLine().trim();


            //asks user if they want to deposit or not
            switch (yOrN.toLowerCase()) {
                case "y":
                    //asking how much to deposit
                    System.out.println("Which account would you like to deposit to?\nex: Sydney Sweeney, Ken Carson\n");
                    String account = input.nextLine();
                    System.out.println("How will you be depositing today?\nex: Paycheck, Bank Transfer, Cash\n");
                    String paymentMethod = input.nextLine();
                    System.out.println("How much would you like to deposit?\n");
                    double depositAmount = input.nextDouble();
                    input.nextLine();
                    System.out.println("\nYou are about to deposit $" + String.format("%.2f", depositAmount) + " using " + paymentMethod + "\nChoose: (Y) Continue or (N) Cancel");
                    String yOrNToDeposit = input.nextLine().trim();




                    //asks user if they want to continue the deposit or cancel
                    switch (yOrNToDeposit.toLowerCase()) {
                        case "y":
                            System.out.println("$" + String.format("%.2f", depositAmount) + " has been deposited into your account.\nReturning to the main menu ... \n");
                            try {
                                writeTransactions(LocalDate.now(), LocalTime.now(), paymentMethod, account, depositAmount);
                            } catch (IOException e) {
                                System.out.println("Transaction failed, Please try again.");
                            }
                            depositRunning = false;
                            break;
                        case "n":
                            System.out.println("Deposit has been canceled \nReturning to the main menu ...\n");
                            depositRunning = false;
                            break;
                        default:
                            System.out.println("Invalid try again \n");
                    }
                    break;
                case "n":
                    depositRunning = false;
                    System.out.println("Deposit has been canceled.\nReturning to main menu..\n");
                    break;
                default:
                    System.out.println("Invalid try again \n");
            }
        }
    }



    //allows the user to submit a payment
    public static void makePayment(Scanner input) {
        boolean makingPayment = true;


        while (makingPayment) {
            System.out.println("Would you like to make a payment?");
            System.out.println("Choose: (Y) Continue or (N) Go back to main menu");
            String yOrN = input.nextLine().trim();

            //asks user if they want to make a payment or not
            switch (yOrN.toLowerCase()) {
                case "y":

                    //asking who they are paying and how much
                    System.out.println("Who will you be paying today? \nex: Walmart, Target, Amazon, Chevron");
                    String vendor = input.nextLine();
                    System.out.println("What will you be purchasing?");
                    String paymentMethod = input.nextLine();
                    System.out.println("Enter amount being sent:");
                    double paymentAmount = input.nextDouble();
                    input.nextLine();

                    System.out.println("You are about to make a payment of $" + String.format("%.2f", paymentAmount) + " to " + vendor + "\nChoose: (Y) Continue or (N) Cancel");
                    String yOrNToPayment = input.nextLine().trim();

                    //asks user if they want to continue the payment or cancel
                    switch (yOrNToPayment.toLowerCase()) {
                        case "y":

                            System.out.println("You paid " + vendor + " $" + String.format("%.2f", paymentAmount) + ".\nReturning to the main menu \n");
                            double negativeAmount = paymentAmount * -1;
                            try {
                                writeTransactions(LocalDate.now(), LocalTime.now(), paymentMethod, vendor, negativeAmount);
                            } catch (IOException e) {
                                System.out.println("Transaction failed, Please try again.");
                            }
                            makingPayment = false;
                            break;
                        case "n":
                            System.out.println("Payment has been canceled \n");
                            makingPayment = false;
                            break;
                        default:
                            System.out.println("Invalid try again \n");
                    }
                    break;
                case "n":
                    System.out.println("Payment has been canceled \nReturning to the main menu ...\n");
                    makingPayment = false;
                    break;
                default:
                    System.out.println("Invalid try again \n");
            }
        }
    }
    //opens the ledger
    public static void openLedger(Scanner input) {
    }

    public static void writeTransactions(LocalDate purchaseDate, LocalTime purchaseTime, String description, String vendor, double amount) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\manzo\\pluralsight\\Learn_to_Code_Capstones\\AccountLedgerApp\\src\\transactions.csv", true);
        UserTransactions newTransaction = new UserTransactions(purchaseDate, purchaseTime, description, vendor, amount);
        writer.write(" \n" + newTransaction.toString());
        writer.close();
        allUserTransactions.addFirst(newTransaction);
    }

}