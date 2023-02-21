package Project 1A;

public class Budget 
{
    public static void main(String[] args)
    { 
        // ************
        // Project 1A
        // ************
        
        //Monthly Expenses
        int monRent = 625;
        int monInt = 27;
        int monGroc = 250; 
        int monFun = 150;
        double wage = 10.0;
        double savings = 100.0;
        int monExpenses = (monRent + monInt + monGroc + monFun);

        //Calculate how many hours the student will have to work to afford the monthly expenses listed above.
        double totalHours = monExpenses / wage;

        //Calculate how many hours the student will have to work to include an additional savings of $100 per month.
        double extra = (monExpenses + savings) / wage;

        //Print statements
        System.out.println("Your hourly wage is $" + wage + ".");
        System.out.println("Your monthly rent is $" + monRent + ".");
        System.out.println("Your monthly grocery expense is $" + monGroc + ".");
        System.out.println("Your monthly fun expense is $" + monFun + ".");
        System.out.println("Your total monthly expenses is $" + monExpenses + ".");
    
        System.out.println("The total amount of hours you'd have to work to break even is " + totalHours + " hours.");
        System.out.println("The total amount of hours you'd have to work to have $100 in savings is " + extra + " hours.");

        //Extra sentence
        System.out.println("Oh man, I need to get a job to pay these expenses!");
    }
}