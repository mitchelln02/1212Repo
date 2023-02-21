import java.util.Scanner;

public class TimeConversionDriver {

    public static void main(String[] args) {

        // statements for output formatting
        System.out.println("*******************************");
        System.out.println("Start - Time Conversion Program");
        System.out.println("*******************************");


        // variable to store user input
        int numSeconds;

        /**
         * TO DO: ask the user to enter the number of seconds to be converted 
         * and assign the value to numSeconds
         */  
          System.out.println("Enter the time in seconds: ");
          Scanner myScanner = new Scanner(System.in);
          numSeconds = myScanner.nextInt(numSeconds);
          //int numSeconds = newSeconds;
          //System.out.println(numSeconds);
           

        
        

        
        // you do not need to add anything below this line
        // create TimeConversion object
        int converter;
        TimeConversion converter = new TimeConversion(numSeconds);
        
        // call method to calculate Decaseconds
        showDecaseconds(numSeconds);
        System.out.println("A decasecond is equal to 10 seconds");
        System.out.println("This method will convert seconds to decaseconds.");
        converter.showDecaseconds(numSeconds);
        Double decaseconds = (double) (numSeconds / 10);
        System.out.println(numSeconds + "is equal to " + decaseconds + " decaseconds.");
        
        
        // call method to calculate Jeffies
        showJiffies(numSeconds);
        System.out.println("A jiffy is equal to 10 millisenconds");
        System.out.println("This method will convert seconds to jiffies.");
        converter.showJiffies(numSeconds);
        int Jiffies = numSeconds / 100;
        System.out.println(numSeconds + "seconds is equal to " + Jiffies + " jiffies.");
        
        
        
        // call method to calculate New York minutes
        showNewYorkMinutes(numSeconds);
        System.out.println("A second is equal to 20 New York minutes.");
        System.out.println("This method will convert seconds to New York minutes.");
        converter.showJiffies(numSeconds);
        converter.showNewYorkMinutes(numSeconds);
        Int NewYorkMinutes = numSeconds * 20;
         System.out.println(numSeconds + " is equal to " + NewYorkMinutes + " New York minutes.");
        
        // call method to calculate Nano Centuries 
        showNanoCenturies(numSeconds);
        converter.showNanoCenturies(numSeconds);
        Double nanoCenturies = numSeconds / 3.156;
        System.out.println("A nanocentury is a computing measurement coined from the expression -");
        System.out.println(" never let the user wait more than a few nanocenturies for a response. It is 3.156 seconds.");
        System.out.println(numbSeconds + "seconds is equal to " + nanoCenturies + "nanoCenturies.");
        
        
        // call method to calculate Scaramuccis
        showScaramuccis(numSeconds);
        converter.showScaramuccis(numSeconds);
        Double Scaramuccis = numbSeconds / 950400;
        System.out.println("A second is equal to 1/950400 Scaramuccis.");
        System.out.println("This method will convert seconds to Scaramuccis.");
        System.out.println(numbSeconds + "seconds is equal to " + Scaramuccis + "Scaramuccis.");

        // statements are for output formatting
        System.out.println("*******************************");
        System.out.println("End - Time Conversion Program");
        System.out.println("*******************************");    
    
    }//end main method
}//end class
