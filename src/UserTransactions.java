import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UserTransactions {

    //created variables
    LocalDate purchaseDate = LocalDate.now();
    LocalTime purchaseTime = LocalTime.now();
    String description;
    String vendor;
    double amount;

    //set the variables in constructor
    public UserTransactions (LocalDate purchaseDate, LocalTime purchaseTime, String description, String vendor, double amount){
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;

    }

    //to string method to format print
    public String toString(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");

        return dateFormat.format(purchaseDate) + "|" + timeFormat.format(purchaseTime) + "|" + description + "|" + vendor + "| " + String.format("%.2f", amount);
    }
}