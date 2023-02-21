/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;
/**
 * @version 2
 * @author mnguy
 */
public class BurgerOrder {
   /*
    *@param numHamburger is number of hamburgers
    *@param numCheeseburger is number of cheeseburgers
    *@param numVeggieburgers is number of veggie burgers
    *@param numSoda is how many sodas
    *@param orderToGo is if it is to go or not
    *@param orderNum is the number of orders
    */
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 2;
    
      /*
    *@param numHB is number of hamburgers
    *@param numCB is number of cheeseburgers
    *@param numVB is number of veggie burgers
    *@param numSoda is how many sodas
    *@param toGo is if it is to go or not
    *@param orderNum is the number of orders
    */
    public BurgerOrder(int numHB, int numCB, int numVB, int numSoda, boolean toGo, int orderNum){
        this.numHamburgers = numHB;
        this.numCheeseburgers = numCB;
        this.numVeggieburgers = numVB;
        this.numSodas = numSoda;
        this.orderToGo = toGo;
        this.orderNum = orderNum;
    }
    //@return number of hamburgers
    public int getNumHamburgers(){
        return numHamburgers;
    }
    //@param num
    public void setNumHamburgers(int num){
        if (num<0){
            System.out.println("Error!! Value inputted too low.");
        }
        else
            numHamburgers = num;
    }
    //@return number of cheese burgers
    public int getNumCheeseburgers(){
        return numCheeseburgers;
    }
    //param num
    public void setNumCheeseburgers(int num){
        if (num<0){
            System.out.println("Error!! Value inputted too low.");
        }
        else
            numCheeseburgers = num;
    }
    //@return number of veggie burgers
    public int getNumVeggieburgers(){
        return numVeggieburgers;
    }
    //param num
    public void setNumVeggieburgers(int num){
        if (num<0){
            System.out.println("Error!! Value inputted too low.");
        }
        else
            numVeggieburgers = num;
    }
    //@return number of sodas
    public int getNumSodas(){
        return numSodas;
    }
    //@param num
    public void setNumSodas(int num){
        if (num<0){
            System.out.println("Error!! Value inputted too low.");
        }
        else
            numSodas = num;
    }
    //@return a string for true or false
    public String isOrderToGo(){
        String a = "";
        if(orderToGo = false){
            a = "No";
        }
        else if (orderToGo = true){
            a = "Yes";
        }
        return a;
    }
    //1 for yes, 0 for no
    //@param b
    public void setOrderToGO(int b){
        if (b == 1){
            orderToGo = true;
        }
        else if (b == 0){
            orderToGo = false;
        }
    }
    //@return number of orders
    public int getOrderNum(){
        return orderNum;
    }
    //@param num
    public void setOrderNum(int num){
        if (num<0){
            System.out.println("Error!! Value inputted too low.");
        }
        else
            orderNum = num;
        
    }
    //@return a string for how many of each item
    public String toString(){
        return "Hamburgers: " + numHamburgers + ", Cheeseburgers: " + numCheeseburgers + ", Veggieburgers: " + numVeggieburgers + ", Sodas: " + numSodas + ", OrderToGo: " + orderToGo + ", OrderNumber: " + orderNum;
    }
    //@return total burgers in an order
     public int getBurgerTotal(){
        return (this.numHamburgers + this.numCheeseburgers + this.numVeggieburgers);
    }
}


        




