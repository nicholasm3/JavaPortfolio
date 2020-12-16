
package miller_vprofits;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Date;

public class ProfitCalculator {
    // data type    name     assignment operator    value
    int price;
    String name = "Circuit Board Warehouse";
    double profitPercentage;
    int retailPrice = 200;
    double percentage;
    double profit;
    char runAgain;
    
    Scanner keyboard = new Scanner(System.in);
   
    public void missionControl(){
        getUserInput();
        displayInfo();
        repeatApp();
    }
    
    public void getUserInput() {
        // User inputs circuit board price
        System.out.println("Input price of circuit board: ");
        price = keyboard.nextInt();
        // User inputs company name
        System.out.println("Input company name: ");
        name = keyboard.nextLine();
        keyboard.nextLine();
        // User inputs profit percentage
        System.out.println("Enter profit percentage: ");
        profitPercentage = keyboard.nextDouble();
        percentage = profitPercentage/ 100;
        DecimalFormat df = new DecimalFormat("0.00");
        keyboard.nextLine();
       
}

    public void displayInfo(){
        profit =  retailPrice * profitPercentage; 
        // Displays profit
        System.out.println("Profit is $" + profit);
        // Displays retail price
        System.out.println("Retail price is $" + retailPrice);
        // Displays current time and date for user
        System.out.println("We are Circuit Board Solutions\n"
                         + "and the current time and date is:");
        Date d = new Date();
        System.out.println(d);
    }
    
    public void repeatApp (){
        // Asks user if they would like to run app again
        System.out.println("Would you like to continue for\n"
                         + "more calculations?\n"
                         + "Enter Y or N \t");
        runAgain = keyboard.next().toUpperCase().charAt(0);
        while(runAgain == 'Y')
        
        {
            getUserInput();
            displayInfo();
            repeatApp();
        }
    }
    
}