
/**
* @author Tyler Fuentes, Whit Huntley, Justin Laing, Mitchell Nguyen
* ITSC-1212:153, Mazumder
* @version 1.0
* @since 2021-09-07
* Lab 2
* 
* Explaination: Our Lab2 is where we set different variables and learn
*how to cast the variables to different variables. We changed from int to double 
*and back and forth. Then we learned modulo which tells us the remainer of an equation.
*/

public class ITSC1212Lab2 {
    public static void main(String[] args){
        // ----- Part A -----
        /*
        short x = 0;
        short y = 2000;
        int z = 100000;
        
        char a = 'a';
        char b = 'b';
        
        boolean boo = true;

        /**
         * To store the value of x+y+z, we would need an int type. This
         * is because otherwise the value (102000) would be too large 
         * to be stored in a short, which only holds values up to 2^16.
         */
        //System.out.println(x + y + z);

        /**
         * The value printed is 195, which is the sum of the ASCII
         * values 'a' (DEC 97) and 'b' (DEC 98)
         
        System.out.println(a + b);
        
        System.out.println(x < y);
        System.out.println(y > z);
        System.out.println(z < a); 
        

        // ----- Part B -----
        //int ex = 4.0;
        int ex = (int) 4.0;
        double x = 8.8;
        double y = 2.2;

        System.out.println(x / y);
        System.out.println(x /(int) y);
        System.out.println((int)x / y);
        System.out.println((int)(x / y));

        double cost = 10.10;
        double paid = 12.33;
        double change = (paid - cost);
        int changeCents = (int) ((paid - cost) * 100);
        double finalChange = (double) (changeCents / 100.0);
        System.out.println("The change owed on this transaction is: " + finalChange);

        /**
         * Note that for efficiency sake, this is a more optimal way to
         * have it print a set number of decimals.
         
        System.out.println(String.format("The change owed on this transaction is: %.2f", change));
        

        //----- Part C -----
        int totalDays = 11111;
        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int remainderDays = (totalDays % 365) % 7;
        System.out.println(String.format("%d days is %d years, %d weeks, and %d days", totalDays, years, weeks, remainderDays));
        */

        /**
         * We added the string format to make it easier to type out
         * the number of total days and remainning years, weeks, and days left
         */
    }
}
