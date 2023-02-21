/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;
import java.util.Scanner;
/**
 *
 * @author mnguy
 * @version 2.0
 */
public class FastFoodKitchen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*    
       BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, false, 1);
       BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, true, 2);
       BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, false, 3);
       
       order1.setNumSodas(12);
       
       System.out.println(order1);
       System.out.println(order2);
       System.out.println(order3);
       */
        FastFoodSimulation kitchen = new FastFoodSimulation();
Scanner sc = new Scanner(System.in);
//@return this will make you choose which thing you wanna do
while (kitchen.getNumOrdersPending() != 0) {
    // see what the user wants to do
    System.out.println("Please select from the following menu of options, by typing a number:");
    System.out.println("\t 1. Order food");
    System.out.println("\t 2. Cancel last order");
    System.out.println("\t 3. Show number of orders currently pending.");
    System.out.println("\t 4. Exit");
    System.out.println("\t 5. Checking on order");
    System.out.println("\t 6. Canceling an order");
    int num = sc.nextInt();
    switch (num) {
            //@return this is what the program will ask if you choose 1 which is placing order
        case 1:
            System.out.println("How many hamburgers do you want?");
            int ham = sc.nextInt();
            System.out.println("How many cheeseburgers do you want?");
            int cheese = sc.nextInt();
            System.out.println("How many veggieburgers do you want?");
            int veggie = sc.nextInt();
            System.out.println("How many sodas do you want?");
            int sodas = sc.nextInt();
            System.out.println("Is your order to go? (Y/N)");
            char letter = sc.next().charAt(0);
            boolean TOGO = false;
            if (letter == 'Y' || letter == 'y') {
                TOGO = true;
            }
            int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
            System.out.println("Thank-you. Your order number is " + orderNum);
            System.out.println();
            break;
            //@return this is what happens when you choose 2 which is canceling order
        case 2:
            boolean ready = kitchen.cancelLastOrder();
            if (ready) {
                System.out.println("Thank you. The last order has been canceled");
            } else {
                System.out.println("Sorry. There are no orders to cancel.");
            }
            System.out.println();
            break;
        //@return this will show you how many orders are pending when choosing 3
        case 3:
            System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
            break;
        //@return this will exit you from the program which is 4
        case 4:
            System.exit(0);
            break;
        case 5:
            System.out.println("Enter the order you want to check on");
            boolean b = kitchen.isOrderDone(sc.nextInt());
            if(b == true){
                System.out.println("No order was found");
            }
            else{
                System.out.println("Your order is being prepared");
            }
            break;
        case 6:
            System.out.println("Enter the order that you want to cancel");
            boolean c = kitchen.cancelOrder(sc.nextInt());
            if(c == true){
                System.out.println("Your order has been successfully canceled");
            }
            else{
                System.out.println("Sorry, we cant find your order number in the system.");
            }
            break;
        default:
            System.out.println("Sorry, but you need to enter a 1, 2, 3, 4, 5 or a 6");
            //@return choosing an option our of 1-4 will give you this line.
    }

} // end while loop
    }
}
