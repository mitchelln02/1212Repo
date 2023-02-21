/**
* @author  Mitchell Nguyen, Tyler Fuentes, Whit Huntley, Justin Laing,
* ITSC-1212:153, Mazumder
* @version 1.0
* @since   2021-09-21
* Lab 4 ITSC 1212
* We are coding and understanding the uses of Strings and understanding they are immutable. 
* We also explore other ways to change the strings.
*/

//import java.util.Scanner;

public class ITSC1212Lab4 {
    
    public static void main(String[] args) {
        //--- Part A---//
        /*Scanner scnr = new Scanner(System.in);
       
        System.out.print("Enter your name\n> ");
        
        String name = scnr.nextLine();
        
        System.out.println("Welcome to ITSC1212 " + name.toUpperCase());
        //The scanner was never closed and the return value of toUpperCase 
        //must be used. I think it never worked because the values can't change.

        This works because it sets the value for the name after it has returned to uppercase.
        */
        String name = "mitchell";
        String welcomeMessage = "Welcome to ITSC 1212 " + name;
        System.out.println(welcomeMessage);
        System.out.println("The length of this message is "+ (welcomeMessage.length()));
        int pos = welcomeMessage.indexOf("to");
        System.out.println("The word 'to' is located at " + pos);

    }
}