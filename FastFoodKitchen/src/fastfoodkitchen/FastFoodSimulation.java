/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

import java.util.ArrayList;

/**
 *
 * @author Mitchell Nguyen
 * @version 2
 * 
 */

public class FastFoodSimulation {

    private ArrayList<BurgerOrder> orderList= new ArrayList<>();   
    private static int nextOrderNum;
    //@return this will return how many orders are next
    public static int getNextOrderNum(){
        return nextOrderNum;
    }
    //adds one to nextOrderNum
    private static void incrementNextOrderNum(){
        nextOrderNum += 1;
    }
    
    public FastFoodSimulation(){
    BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum());
    BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, true, getNextOrderNum());
    BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, false, getNextOrderNum());
    orderList.add(order1);
    incrementNextOrderNum();
    orderList.add(order2);
    incrementNextOrderNum();
    orderList.add(order3);
    incrementNextOrderNum();
    }
    /*
    *@param ham is number of hamburgers
    *@param cheese is number of cheeseburgers
    *@param veggie is number of veggie burgers
    *@param soda is how many sodas
    *@param togo is if it is to go or not
    *@returns this constructor returns the next order num
    */
    public int addOrder(int ham, int cheese,  int veggie, int soda, boolean toGo){
        BurgerOrder newOrder = new BurgerOrder(ham, cheese, veggie, soda, toGo, getNextOrderNum());
        orderList.add(newOrder);
        incrementNextOrderNum();
        return getNextOrderNum();
    }
    //@return a true or false for canceling last order
    public boolean cancelLastOrder(){
        if(orderList.size()>0){
            orderList.remove(orderList.size() -1);
            return true;
        }
        else{
        return false;
       }
    }
    //@return the arraylist size
    public int getNumOrdersPending(){
        return orderList.size();
    }

    //@returns a string saying how many of each is in the list
    public String toString() {
        return "FastFoodSimulation{" + "orderList=" + orderList + '}';
    }
    //returns true or false of an order completion
    //param orderID
    public boolean isOrderDone(int orderID){
        for(int i = 0; i<orderList.size(); i++){
            if (/*orderList.get(i).getOrderNum()*/ nextOrderNum == orderID){
                return false;
            }
            
        }
        return true;
    }
    //@param orderID
    //@return true or false for canceling order
    public boolean cancelOrder(int orderID){
        for(int i = 0; i < orderList.size(); i++){
            if(/*orderList.get(i).getOrderNum()*/orderList.get(i).getOrderNum()== orderID){
                orderList.remove(orderID);
                nextOrderNum -= 1;
                return true;
            }
                
        }
        return false;
    }
    //@param orderID
    //@returns seq which is where the item is 
    public int findOrderSeq(int orderID){
        int seq = orderID;
        for (int i =0; i < orderList.size(); i++ ){
            if (seq == orderList.get(i).getOrderNum()){
                seq = i;
            } else{
                seq = -1;
            }
        }
        return seq;
    }
    
  
    
    public void selectionSort(){
        for (int i = 0; i<orderList.size(); i++){
            int pos = i;
            for (int j = i+1; j<orderList.size();j++){
                if(orderList.get(j).getBurgerTotal() < orderList.get(pos).getBurgerTotal())
                    pos = j;
            }
            BurgerOrder min = orderList.get(i);
            orderList.set(i, orderList.get(pos));
            orderList.set(pos,min);
        }
    }
    //@returns orderlist
    public ArrayList<BurgerOrder> getOrderList(){
        return orderList;
    }
    
    public void insertionSort(){
        for (int i = 0; i < orderList.size(); i++){
            int j = i;
            
            
            while ((j>0)&& (orderList.get(j).getBurgerTotal() < orderList.get(j-1).getBurgerTotal())){
                BurgerOrder temp = orderList.get(j);
                orderList.set(j, orderList.get(j-1));
                orderList.set(j-1, temp);
                j--;
            }
            
        }
    }
    //@param orderID
    //@returns median or -1 for the location
    public int findOrderBin(int orderID){
        int left = 0;
        int right = orderList.size()-1;
        while(left <= right){
            int mid = left + (left +right)/2;
            int median = orderList.get(mid).getOrderNum();
            if(median == orderID){
                return median;
            }if (median < orderID){
                left = median +1;
            }if (median > orderID){
                right = median - 1;
            }
        }
        return -1;
    }
}
