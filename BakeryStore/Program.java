//To start the program please enter this command: "java -classpath . Program"  
//Please make the terminal larger to account for the ACII art
//Then follow the prompts to calculate your order.
//Code is commmented out in Journal Entry

import BakeryStore.Models.Bread;
import BakeryStore.Models.Pastry;
import BakeryStore.Models.ShoppingCart;
import java.util.Scanner;

public class Program {

public class Main {
    public static void main(String[] args) {
        System.out.println(" __            __  _                             _           _____                  _        ____        _");
        System.out.println("  \\ \\        / / | |                           | |         / ____|                ( )      |  _ \\     | |");
        System.out.println("   \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___   | |_ ___   | (___   ___  __ _ _ __ |/ ___  | |_) | __ _| | _____ _ __  ____   _");
        System.out.println("    \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\  | __/ _ \\   \\___ \\ / _ \\ / _` | '_ \\  / __| |  _ < / _` | |/ / _ \\ '_|");
        System.out.println("     \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  ____) |  __/ (_| | | | | \\__ \\ | |_) | (_| |   <  __/ |  | |_| |_|");
        System.out.println("      \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__\\___/  |_____/ \\___|\\__,_|_| |_| |___/ |____/ \\__,_|_|\\_\\___|_|");
        System.out.println("                                                                                                                           _  |");
        System.out.println("                                                                                                                         |___|");
    }
}



    String singleBreadPrice = "One bread loaf = $5.";
    String singlePastryPrice = "One Pastry = $2.";
    String userInputStart =
      "Please press a key to continue and see available offers.";
    String breadDeal = "buy two get one free!";
    String pastryDeal = "One Pastry for $2. Or 3 pastries for $5!";
    String couponCode = "PIERRESBAKERYCOUPON1234";
    System.out.println(
      "We're excited for you try our delicious Breads and Pastries!"
    );
    System.out.println(
      "Our fresh out the oven bread can be had at: " + singleBreadPrice
    );
    System.out.println(
      "Our freshly baked pastries can be had for: " + singlePastryPrice
    );
    System.out.println(userInputStart);

    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    System.out.println(
      "Before I take your order; I would like to make you aware of our current promotions."
    );
    System.out.println("Today I can offer our bread at: " + breadDeal);
    System.out.println(
      "I can also offer our pastries at even greater discount: " + pastryDeal
    );

    System.out.println();

    System.out.println(
      "Please enter how many loafs of bread you would like to order today?"
    );
    String breadOrder = scanner.nextLine();
    int BreadQuantity = Integer.parseInt(breadOrder);
    Bread customerBreadOrder = new Bread(BreadQuantity);
    customerBreadOrder.calculateTotalCost();

    System.out.println("Please enter how many pastries you would like?");
    String pastryOrder = scanner.nextLine();
    int Quantity = Integer.parseInt(pastryOrder);
    Pastry customerPastryOrder = new Pastry(Quantity);
    customerPastryOrder.calculateTotalCost();

    ShoppingCart CombinedShoppingCart = new ShoppingCart(customerBreadOrder, customerPastryOrder);
    
    int totalCost = CombinedShoppingCart.getTotalCost();
    System.out.println("Your total comes to: $ " + totalCost);
    System.out.println(
      "Come again! As a gesture of our gratitude, please accept this coupon for 25% off your next order."
    );
    System.out.println();
    System.out.println("Coupon code: " + couponCode);
  }
}
