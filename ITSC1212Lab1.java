import java.util.Scanner;
/*
* @author Tyler Fuentes, Whit Huntley, Justin Lang, Mitchell Nguyen
* ITSC-1212:153 Mazumder
* @version 1.0
* @since 2021-08-31
* Lab 1
* Prints hello, prints x and modified values to display explicit
*   typecasting, then asks for user input for a temperature value in
*   fahrenheit, converts it to celsius, then displays appropriate
*   outfit recommendations.
*/

// TODO: Remove the package call.
// TODO: Conform to Style Guidelines

// Part A : Getting started in VS code
public class ITSC1212Lab1 {
// Part B : Creating an running your first java class
    public static void main(String[] args) 
    {
// Part C:  Variables and Assignment
        //System.out.print("Hello");
        //System.out.print("World");

        
        int x = 5;
        System.out.println("The value of x");
        System.out.println(x);
        System.out.println("The value of x + 2");
        System.out.println(x + 2);
        System.out.println("The value of x * x");
        System.out.println(x * x);
        System.out.println("The value of x / 2");
        double y= x/2.0;
        System.out.println(y);
        
        /*
        *We tried to put 2 to begin with but it gave us the answer of 2.
        *Then we put in 2.0 because java reads it in double so our answer 
        *can be in a double form and correct.
        */
        
    //Part E : Temperature Conversion
    System.out.println("Enter a temperature in F");
    // Reads a value from stdin and casts it as a double assigned
    //  to a value to "tempF"
    Scanner myScanner = new Scanner(System.in);
    // Scanners read from stdin
    double tempF = myScanner.nextDouble();
    // prevents potential memory leak
    System.out.println("The value entered was " + tempF);
    double tempC = (tempF - 32) * (5.0/9.0);
    //Converts the tempF to tempC with the formula and prints the value
    System.out.println("Your temperature is "+tempC+" celcius.");

    // Provides an appropriate suggestion of what to wear based on 
    // temperature.
    // TODO: In the future, this should be a case-switch statement,
    //   This was not done for simplicities sake.
    if (tempC < 10.0) 
        {
            System.out.println("It's cold! Bring a jacket!");
        }
        else if (tempC < 20.0) 
        {
            System.out.println("It's chilly, wear a sweater.");
        } 
        else if (tempC < 32.0) 
        {
            System.out.println("It's warm, time for shorts!");
        } 
        else 
        {
            System.out.println("It's too hot! Stay inside!");
        }
    }
}