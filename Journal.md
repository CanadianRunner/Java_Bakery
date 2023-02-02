Java Journal Template 
Directions: Follow the directions for each part of the journal template. Include in your response all the elements listed under the Requirements section. Prompts in the Inspiration section are not required; however, they may help you to fully think through your response.
Remember to review the Touchstone page for entry requirements, examples, and grading specifics.

Name: Sean Keane
Date: 1/29/2023
Final Replit Program Share Link: https://replit.com/join/plpblrjhth-canadianrunner
Complete the following template. Fill out all entries using complete sentences.

 
PART 1: Defining Your Problem

Task
State the problem you are planning to solve.

Requirements
●	Describe any input data you expect to use. 
●	Describe what the program will do to solve the problem. 
●	Describe any outputs or results the program will provide.

Inspiration
When writing your entry below, ask yourself the following questions:
●	Why do you want to solve this particular problem?
●	What source(s) of data do you believe you will need? Will the user need to supply that data, or will you get it from an external file or another source?
●	Will you need to interact with the user throughout the program? Will users continually need to enter data in and see something to continue?
●	What are your expected results or what will be the end product? What will you need to tell a user of your program when it is complete?

I would like to create a basic shop in the terminal that will allow a user to shop in my bakery.  I would like to create a “splash screen” that prompts the user to interact with the program.  The customer will be presented with the starting price of my baked goods and then responds to input.  I would also like to create logic for promotions.  Lastly, I would like to calculate the customer’s order, printing this information to the console.

I’d like to experiment with ASCII art to dress up the console for customers (welcome screen).  I’d like to establish two separate classes (bread/pastries) and import my shopping cart logic, Bread, and Pastry into the main program file.

 
PART 2: Working Through Specific Examples

Task
Write down clear and specific steps to solve a simple version of your problem you identified in Part 1.

Requirements
Complete the three steps below for at least two distinct examples/scenarios.
●	State any necessary input data for your simplified problem. 
●	Write clear and specific steps in English (not Java) detailing what the program will do to solve the problem. 
●	Describe the specific result of your example/scenario.

Inspiration
When writing your entry below, ask yourself the following questions:
●	Are there any steps that you don’t fully understand? These are places to spend more time working out the details. Consider adding additional smaller steps in these spots.
●	Remember that a computer program is very literal. Are there any steps that are unclear? Try giving the steps of your example/scenario to a friend or family member to read through and ask you questions about parts they don’t understand. Rewrite these parts as clearly as you can.
●	Are there interesting edge cases for your program? Try to start one of your examples/scenarios with input that matches this edge case. How does it change how your program might work?

  This will be my first program in Java. I understand that I will need to consult the documentation and lessons from Sophia.org in order to successfully implement my program.  Java syntax will not come easily to me, but with patience and trial/error; I am confident that I will be able to effectively manage the development of this application.

I will need to establish prices per unit of my goods ($5 for a loaf of bread and $2 per pastry) then ask for input from the user.  If the user adds one loaf of bread and one pastry, I would expect my calculator to output a $7 total after my ShoppingCart logic has been applied.

Another scenario would be for a larger order.  If a user selects 15 loafs of bread and 40 pastries, I would expect the ShoppingCart logic to return a bill for $117.

 
PART 3: Generalizing Into Pseudocode

Task
Write out the general sequence your program will use, including all specific examples/scenarios you provided in Part 2.

Requirements
●	Write pseudocode for the program in English but refer to Java program elements where they are appropriate. The pseudocode should represent the full functionality of the program, not just a simplified version. Pseudocode is broken down enough that the details of the program are no longer in any paragraph form.  One statement per line is ideal.

Help With Writing Pseudocode
●	Here are a few links that can help you write pseudocode with examples.  Remember to check out part 3 of the Example Journal Template Submission if you have not already.  Note: everyone will write pseudocode differently.  There is no right or wrong way to write it, other than to make sure you write it clearly and in as much detail as you can so that it should be easy to convert to code later.
○	https://www.geeksforgeeks.org/how-to-write-a-pseudo-code/ 
○	https://www.wikihow.com/Write-Pseudocode 

Inspiration
When writing your entry below, ask yourself the following questions:
●	Do you see common program elements and patterns in your specific examples/scenarios in Part 2, like variables, conditionals, functions, loops, and classes? These should be part of your pseudocode for the general sequence as well.
●	Are there places where the steps for your examples/scenarios in Part 2 diverged? These may be places where errors may occur later in the project. Make note of them.
●	When you are finished with your pseudocode, does it make sense, even to a person that does not know Java? Aim for the clearest description of the steps, as this will make it easier to convert into program code later.

//Program.java
1.	Import all my files located in my Models folder
2.	Import Java Scanner class for reading input from the user into the Program file
3.	Define a public class named ‘Program’
4.	Define a public static void method ‘main’ with one parameter inside the Program class.
5.	I print my ASCII art welcome screen to the console “Welcome to Sean’s Bakery.”
6.	I instantiate a number of string variables below.  The thought process behind this was quick updating of prices/coupons etc.
7.	Create a string variable "singleBreadPrice" and assign it the value "One bread loaf = $5.".
8.	Create a string variable "singlePastryPrice" and assign it the value "One Pastry = $2.".
9.	Create a string variable "userInputStart" and assign it the value "Please press a key to continue and see available offers.".
10.	Create a string variable "breadDeal" and assign it the value "buy two get one free!".
11.	Create a string variable "pastryDeal" and assign it the value "One Pastry for $2. Or 3 pastries for $5!".
12.	Create a string variable "couponCode" and assign it the value "PIERRESBAKERYCOUPON1234".
13.	Use the "println" method to print the string "We're excited for you try our delicious Breads and Pastries!".
14.	Use the "println" method to print the string "Our fresh out the oven bread can be had at: " followed by the value of "singleBreadPrice".
15.	Use the "println" method to print the string "Our freshly baked pastries can be had for: " followed by the value of "singlePastryPrice".
16.	Use the "println" method to print the value of "userInputStart".
17.	Create a new instance of the "Scanner" class called "scanner".
18.	Use the "nextLine" method from the "scanner" object to wait for user input.
19.	Use the "println" method to print the string "Before I take your order; I would like to make you aware of our current promotions.".
20.	Use the "println" method to print the string "Today I can offer our bread at: " followed by the value of "breadDeal".
21.	Use the "println" method to print the string "I can also offer our pastries at even greater discount: " followed by the value of "pastryDeal".
22.	Use the "println" method to print an empty line.
23.	Use the "println" method to print the string "Please enter how many loafs of bread you would like to order today?".
24.	Create a string variable "breadOrder" and assign it the value returned by the "nextLine" method of the "scanner" object.
25.	Create an integer variable "BreadQuantity" and assign it the value returned by parsing the value of "breadOrder".
26.	Create a new instance of the "Bread" class called "customerBreadOrder" and pass it the value of "BreadQuantity".
27.	Call the "calculateTotalCost" method from the "customerBreadOrder" object.
28.	Use the "println" method to print the string "Please enter how many

//Models Files:
//Bread.java

1.	Create a class named Bread with a private property breadQuantity.
2.	Implement a constructor for the class that takes an integer argument breadQuantity and sets the breadQuantity property to the argument passed in.
3.	Create a method getTotalCost that returns the value of calculateTotalCost.
4.	Create a method calculateTotalCost that calculates and returns the total cost of the order based on the value of breadQuantity.
5.	Initialize the variable totalCost.
6.	If breadQuantity is greater than 2, do the following:
7.	Calculate the remainder of dividing breadQuantity by 3 and store it in a variable remainder.
8.	Calculate the cost of the deal by multiplying (breadQuantity - remainder) / 3 by 10 and store it in a variable priceOfDeal.
9.	Calculate the cost of the remaining items by multiplying remainder by 5 and store it in a variable priceOfRemaining.
10.	Add priceOfDeal and priceOfRemaining and store the result in totalCost.
11.	If breadQuantity is not greater than 2, multiply breadQuantity by 5 and store the result in totalCost.
12.	Return totalCost.



//Pastry.java

Class Pastry 
2. Create a class named "Pastry" with a private property pastryQuantity. 
3. Initialize private int pastryQuantity 
4. Create public Pastry constructor with one parameter pastryQuantity 
5. Assign pastryQuantity to the private pastryQuantity 
6. Create public int method getTotalCost 
7. Return result of calculateTotalCost method 
8. Create public int method calculateTotalCost 
9. Initialize int variable totalCost 
10. Initialize int variable numberOfDeals with result of pastryQuantity divided by 3 
11. Initialize int variable numberOfRemainders with result of pastryQuantity modulo 3 
12. Initialize int variable priceOfDeals with numberOfDeals multiplied by 5 13. Initialize int variable priceOfRemainders with numberOfRemainders multiplied by 2 
14. Assign sum of priceOfDeals and priceOfRemainders to totalCost 
15. Return totalCost

//ShoppingCart.java

1.	Create a class named ShoppingCart with private properties customerBreadOrder, customerPastryOrder and totalCost.
2.	Implement a constructor for the class that takes two arguments, customerBreadOrder and customerPastryOrder, and sets the corresponding properties to the arguments passed in.
3.	Create a method getTotalCost that returns the value of totalCost.
4.	Create a method calculateTotalCost that calculates and updates the value of totalCost.
5.	In calculateTotalCost, retrieve the cost of the customer's bread order by calling customerBreadOrder.getTotalCost().
6.	Retrieve the cost of the customer's pastry order by calling customerPastryOrder.calculateTotalCost().
7.	Add the cost of the customer's bread order and pastry order and store the result in totalCost.
8.	Return totalCost.





 
PART 4: Testing Your Program

Task
While writing and testing your program code, describe your tests, record any errors, and state your approach to fixing the errors.

Requirements
●	For at least one of your test cases, describe how your choices for the test helped you understand whether the program was running correctly or not.
For each error that occurs while writing and testing your code:
●	Record the details of the error from Replit. A screenshot or copy-and-paste of the text into the journal entry is acceptable.
●	Describe what you attempted in order to fix the error. Clearly identify which approach was the one that worked.

Inspiration
When writing your entry below, ask yourself the following questions:
●	Have you tested edge cases and special cases for the inputs of your program code? Often these unexpected values can cause errors in the operation of your program.
●	Have you tested opportunities for user error? If a user is asked to provide an input, what happens when they give the wrong type of input, like a letter instead of a number, or vice versa?
●	Did the outcome look the way you expected? Was it formatted correctly? 
●	Does your output align with the solution to the problem you coded for?

Test 1: Input:
•	Order: 1 loaf of bread, 0 pastries 
•	Expected Output: $5
•	Total cost: $5
Test 2: Input:
•	Order: 2 loaves of bread, 0 pastries 
•	Expected Output: $10
•	Total cost: $10
Test 3: Input:
•	Order: 3 loaves of bread, 0 pastries 
•	Expected Output: $10
•	Total cost: $10
Test 4: Input:
•	Order: 1 loaf of bread, 3 pastries 
•	Expected Output: $10
•	Total cost: $10
Test 5: Input:
•	Order: 2 loaves of bread, 1 pastry 
•	Expected Output: $12
•	Total cost: $12
Test 6: Input:
•	Order: 3 loaves of bread, 3 pastries 
•	Expected Output: $15
•	Total cost: $15
Test 7: Input:
•	Order: 2 loaves of bread, 5 pastries 
•	Expected Output: $19
•	Total cost: $19

All tests are passing!  I thought these were good tests to run in the console, it allowed me to check my ‘ui’ and utilized multiple configurations.

Errors:
 I had a number of errors getting the ASCII art to display properly.  I solved most of it through trial/error.

I had a number of errors initially related to my namespaces.  I had incorrectly called the file path for my models into the main program file.  This was easily fixed by following error messages.

I had a few syntax errors related spelling mistakes or due to my lack of familiarity with Java.  These were solved by going line by line and resolving these mistakes.

I referenced Java documentation and Sophia’s lesson plans for more insight into tricky errors and proper syntax.

My calculation was simply enough that it allowed me to chase down errors quickly through the console.
   

PART 5: Commenting Your Program

Task
Submit your full program code, including thorough comments describing what each portion of the program should do when working correctly.

Requirements
●	The purpose of the program and each of its parts should be clear to a reader that does not know the Java programming language. 

Inspiration
When writing your entry, you are encouraged to consider the following:
●	Is each section or sub-section of your code commented to describe what the code is doing?
●	Give your code with comments to a friend or family member to review. Add additional comments to spots that confuse them to make it clearer.


<Paste your full program code here, including comments>
Program.java
//To start the program please enter this command: "java -classpath . Program"  
//Please make the terminal larger to account for the ACII art
//Then follow the prompts to calculate your order.

//Program.java

//Import required classes and libraries
import BakeryStore.Models.Bread;
import BakeryStore.Models.Pastry;
import BakeryStore.Models.ShoppingCart;
import java.util.Scanner;
//Declare a public class named Program.
public class Program {
//Declare a private class named Main within Program
public class Main {
    public static void main(String[] args) {
//Print my ASCII art to the console
        System.out.println(" ");
    }
}
     //Create a variable for the singleBreadPrice and set it to a string so the customer can see the price
    String singleBreadPrice = "One bread loaf = $5.";
    //Create a variable for the singlePastryPrice and set it to a string so the customer can see the price
    String singlePastryPrice = "One Pastry = $2.";
// Declare a start message for the user
    String userInputStart =
      "Please press a key to continue and see available offers.";
//Declare the special offers for the bread 
    String breadDeal = "buy two get one free!";
//Declare the special offers for pastries 
    String pastryDeal = "One Pastry for $2. Or 3 pastries for $5!";
//Declare a coupon code for the user (to be displayed on final checkout as a thank you).
    String couponCode = "PIERRESBAKERYCOUPON1234";
//These next few lines are strings welcoming the customer and displaying the price of goods.
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
// I declare a scanner object named scanner to receive user input.
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
//The next few lines are strings that display the available offers for the bakery and incorporate the earlier instantiated prices.
    System.out.println(
      "Before I take your order; I would like to make you aware of our current promotions."
    );
    System.out.println("Today I can offer our bread at: " + breadDeal);
    System.out.println(
      "I can also offer our pastries at even greater discount: " + pastryDeal
    );

    System.out.println();
//Here’s our first prompt that takes user data (total bread loaves) and adds that to my calculation
    System.out.println(
      "Please enter how many loafs of bread you would like to order today?"
    );
//Read the users input
    String breadOrder = scanner.nextLine();
//Here we parse the string input to an integer and create a bread object named customerBreadOrder
//aka convert the input to an integer
    int BreadQuantity = Integer.parseInt(breadOrder);
// Create an instance of the Bread class wiath the quantity specified by the user.
    Bread customerBreadOrder = new Bread(BreadQuantity);
    //Calculate the total cost of the bread order.
customerBreadOrder.calculateTotalCost();
// Ask the user how many pastries they’d like.
    System.out.println("Please enter how many pastries you would like?");
// Read the users Pastry total input
    String pastryOrder = scanner.nextLine();
// Convert the input to an integer
    int Quantity = Integer.parseInt(pastryOrder);
//Create an instance of the Pastry class with quantity specified by the user.
    Pastry customerPastryOrder = new Pastry(Quantity);
//Calculate the total cost of the pastry order
    customerPastryOrder.calculateTotalCost();
// Create an instance of the ShoppingCart class with the customers bread and pastry totals
    ShoppingCart CombinedShoppingCart = new ShoppingCart(customerBreadOrder, customerPastryOrder);
    //Get the total for the shopping cart
    int totalCost = CombinedShoppingCart.getTotalCost();
//Output the total cost of the order to the user
    System.out.println("Your total comes to: $ " + totalCost);
// Output a coupon code as a token of appreciation from the bakery for the order.
    System.out.println(
      "Come again! As a gesture of our gratitude, please accept this coupon for 25% off your next order."
    );
//Print blank line
    System.out.println();
//Print the coupon code instantiated earlier
    System.out.println("Coupon code: " + couponCode);
  }
}

Bread.java
//importing the Models
package BakeryStore.Models;
//Defining the Bread class
public class Bread {
//Declaring a private integer variable named breadQuantity
    private int breadQuantity;

//Defines a constructor that sets the value of breadQuantity to the parameter passed into it.
    public Bread(int breadQuantity) {
        this.breadQuantity = breadQuantity;
    }
//Defines a method named getTotalCost that returns the result of calculateTotalCost
    public int getTotalCost() {
        return calculateTotalCost();
    }
//Defines a method that calculates the total cost of the bread
    public int calculateTotalCost() {
        int totalCost;
//This is the first condition it calculates the totalCost of the order if these conditions are met it will return toalCost
//if breadQuantity is greater than two, proceed into the if statement
        if (breadQuantity > 2) {
// instantiates remainder when dividing the number of loaves by 3. 
            int remainder = breadQuantity % 3;
//Calculates the cost of the loaves that are part of the deal (buy 2 get 1) by subtracting the remainder //from the total loaves and dividing by 3.  Then multiplying that number by 10.
            int priceOfDeal = (((breadQuantity - remainder) / 3) * 10);
//This line calculates the cost of the bread loaves that are not part of the deal by multiplying the //remainder by the cost of each loaf (5 dollars).
            int priceOfRemaining = remainder * 5;
// This line adds the cost of the bread loaves that are part of the deal and those that are not to get the total cost of the bread order.
            totalCost = priceOfDeal + priceOfRemaining;
//This is my else statement if the above logic is not met it will run this statement
        } else {
//If the quantity of bread is less than or equal to 2, the total cost is simply the quantity multiplied by 5
            totalCost = breadQuantity * 5;
        }
// The method closes by returning the totalCost
        return totalCost;
    }
}

Pastry.java
//import Models
package BakeryStore.Models;
//Defining Pastry Class
public class Pastry {
//Declaring a private integer variable named pastryQuantity

    private int pastryQuantity;
// A constructor to initialize the pastryQuantity instance variable with the value passed as argument.

    public Pastry(int pastryQuantity) {
        this.pastryQuantity = pastryQuantity;
    }
//A public method to get the total cost of the pastries by calling the calculateTotalCost method.
//Get the total cost of pastries
    public int getTotalCost() {
        return calculateTotalCost();
    }
  //The logic behind calculateTotalCost

    public int calculateTotalCost() {
        int totalCost;
// Calculate the number of deals (3 pastries for 5 dollars)
        int numberOfDeals = pastryQuantity / 3;
// Calculate the number of pastries that don't fit into a deal int
        int numberOfRemainders = pastryQuantity % 3;
// Calculate the cost of the deals
        int priceOfDeals = numberOfDeals * 5;
// Calculate the cost of the pastries that don't fit into a deal
        int priceOfRemainders = numberOfRemainders * 2;
// Calculate the total cost
        totalCost = priceOfDeals + priceOfRemainders;
// Return totalCost
        return totalCost;
    }
}

ShoppingCart.java
//Import Models
package BakeryStore.Models;
// A class representing a shopping cart of a customer in a bakery store public class ShoppingCart
public class ShoppingCart {
// Field to hold the customer's bread order
    private Bread customerBreadOrder;
// Field to hold the customer's pastry order
    private Pastry customerPastryOrder;
// Field to hold the total cost of the customer's order
    private int totalCost;
//Constructor to set the customer's bread and pastry order and calculate the total cost
    public ShoppingCart(Bread customerBreadOrder, Pastry customerPastryOrder) {
// Assign the customer's bread order to the instance variable
        this.customerBreadOrder = customerBreadOrder;
// Call the calculateTotalCost method to calculate the total cost
        this.customerPastryOrder = customerPastryOrder;
// Getter method to return the total cost of the customer's order        
calculateTotalCost();
    }

    public int getTotalCost() {
        return totalCost;
    }
// Method to calculate the total cost of the customer's order by summing up the cost of their bread and pastry order
    public void calculateTotalCost() {
// Add the total cost of the customer's bread and pastry order
        totalCost = customerBreadOrder.getTotalCost() + customerPastryOrder.calculateTotalCost();
    }
}



PART 6: Your Completed Program

Task
Provide the Replit link to your full program code.

Requirements
●	The program must work correctly with all the comments included in the program.

Inspiration
●	Check before submitting your Touchstone that your final version of the program is running successfully.


<Provide the link to your program here>
https://replit.com/join/plpblrjhth-canadianrunner

Here’s an image of the program running and expected output.  Please note you need to run "java -classpath . Program" in the terminal.  


 

