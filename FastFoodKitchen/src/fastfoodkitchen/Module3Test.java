/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fastfoodkitchen;
import java.util.ArrayList;

/**
 * @version 1
 * @author mnguy
 */
public class Module3Test {
    public static void main(String[] args){
        FastFoodSimulation kitchen = new FastFoodSimulation();
        
        //part a
        //int orderPosition = kitchen.findOrderSeq(1);
        //System.out.println(orderPosition);
        
        //part b
        /*kitchen.selectionSort();
        ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
        int orderSize = 0;
        for (BurgerOrder order : sortedOrders){
            orderSize = order.getBurgerTotal();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");
        */
        //part c
        //kitchen.insertionSort();
        //part d
        int orderPosition = kitchen.findOrderBin(2);
        System.out.println(orderPosition);
    }
}
