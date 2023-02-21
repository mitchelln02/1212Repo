import java.awt.Color;

/**
* @author Tyler Fuentes, Whit Huntley, Justin Laing, Mitchell Nguyen
* ITSC-1212:153, Mazumder
* @version 1.0
* @since 2021-09-14
* Lab 3
* 
* Lab 3 shows how to implement new method. We also use what we learned in our prep
*work with turtle.
*/

class ITSC1212Lab3 {
    public static void main(String[] args) {
        //---Part B---//
        World w = new World(500,500);
        Turtle tom = new Turtle(100,250,w);
        /* The w is needed because it is the world of the turtle that we are using
        * so we can send/place the turtle in it.
        *
        * After adding the 100,100 for the world, it changes the dimensions of the stage and window.
        * This happens because we set the x and y at the length of 100. pixels
        
        
        tom.forward();
        //Move tom forward 100 pixels
        tom.turn(270);
        tom.penUp();
        //Turn tom so it faces left, then moves the pen up
        tom.forward(50);
        //tom moves forward 50 pixels
        tom.turn(180);
        tom.penDown();
        tom.forward();
        //Turns tom around so he faces right, puts the pen down, and draws a 
        // line 100 pixels long 
        tom.penUp();
        tom.forward(15);
        // Picks the pen up and moves over 15 pixels for the next letter.
        tom.penDown();
        tom.turn(90);
        tom.forward();
        // tom turns right and draws a 100 pixel line going down
        tom.turn(-90);
        tom.forward(75);
        tom.turn(-90);
        tom.forward();
        tom.turn(-90);
        tom.forward(75);
        // tom turns left and draws a 75 pixel line for the bottom line
        //tom turns left and draws a 100 pixel line up
        //tom turns left and draws the top line of 75 pixels
        tom.penUp();
        tom.turn(180);
        tom.forward(115);
        // tom turns to the right and moves forward 
        //to the top left corner of the letter M
        tom.penDown();
        tom.turn(90);
        tom.forward();
        tom.turn(180);
        tom.forward();
        //tom puts pen down and turns right to draw the line for M and returns
        tom.turn(115);
        tom.forward(70);
        tom.turn(-55);
        tom.forward(70);
        // tom turns and creates the center two lines
        tom.turn(115);
        tom.forward();
        // tom creates the last line
        
       
        //---Part C---//
        tom.penDown();
        tom.turn(120);
        tom.setPenColor(Color.CYAN);
        tom.hexagon();
        tom.turn(70);
        tom.setPenColor(Color.MAGENTA);
        tom.hexagon();
        tom.turn(100);
        tom.setPenColor(Color.BLACK);
        tom.hexagon();
        tom.turn(80);
        tom.setPenColor(Color.GREEN);
        tom.hexagon();
        tom.turn(50);
         */
        
         //---Part D---//
        tom.hexagon(100);
        tom.turn(60);
        tom.setPenColor(Color.CYAN);
        tom.hexagon(100);
        tom.turn(60);
        tom.setPenColor(Color.MAGENTA);
        tom.hexagon(100);
        tom.turn(60);
        tom.setPenColor(Color.BLACK);
        tom.hexagon(100);
        tom.turn(60);
        tom.setPenColor(Color.GREEN);
        tom.hexagon(100);
        tom.turn(60);
        tom.setPenColor(Color.CYAN);
        tom.hexagon(100);
        tom.turn(60);
        tom.setPenColor(Color.MAGENTA);



    }
}