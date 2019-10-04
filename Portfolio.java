
import apcslib.*;
import java.awt.Color;
import java.io.Console;
import java.util.Scanner;
/**
 * Write a description of class Portfolio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Portfolio
{
    // instance variables - replace the example below with your own
    private int errCode;
    public Portfolio()
    {
        // initialise instance variables
        errCode = 0;
    }
    
    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);
        Portfolio runner = new Portfolio();
        System.out.print('\u000C');
        System.out.println("Hello welcome to Anthony's Portfolio!");
        //System.out.println("What would you like to see first?");
        
        System.out.println("Type exit to exit");
        System.out.println("Type continue to continue");
        String exit= keyboard.nextLine();
        
 
        while(exit.compareTo("exit") != 0){
        System.out.println("What would you like to see");
        System.out.println("Press 1 for House");
        System.out.println("Press 2 for  a Question 1 about drawing Objects");
        System.out.println("Press 3 for Benzene drawing");
        System.out.println("Press 4 for Logo drawing");
        System.out.println("Press 5 for Monkey Song");
        System.out.println("Press 6 for Question 2 about drawing Object");
        System.out.println("Press 7 for Palindrome");
        System.out.println("Press 8 for Jeopardy");
        System.out.println("Press 9 for Knight lab");
            int answer = keyboard.nextInt();
            if(answer==1){
                runner.DrawOutline();
            }
            if(answer==2){
                runner.midtermQuestion();
        
            
            }
            if (answer==3){
               runner.drawBenzene ();
             
            }
            if (answer==4){ 
                CreateLogo temp = new CreateLogo();
                
                temp.main();
            }
            if (answer==5){
                runner.CountdownSong();
                
            }
            if (answer==6){
                runner.Question();
            }
            if (answer==7){
                runner.palindrome();
            }
               
            if (answer==8){
                DrawLine temp = new DrawLine();
                temp.YOLO();
            }
            if (answer==9){
                Knight hi = new Knight();
                hi.printTour();
                
                System.out.println("The code doesn't work in portfolio use seperatley to run program.");
                
            }
        
        
        Scanner yolo = new Scanner (System.in);
        System.out.println("Type exit to exit");
        System.out.println("Type stay to stay");
        exit = yolo.nextLine();
}
  
        
    
}

    
    public void DrawOutline()
    { {
           
           DrawingTool pen;
           
           pen = new DrawingTool(new SketchPad(800, 800));
           
           pen.turnLeft(90);
           pen.forward(150);
           pen.turnRight(90);
           pen.forward(250);
           pen.turnRight(45);
           pen.forward(141.4235);
           pen.turnRight(45);
           pen.forward(100);
           pen.turnRight(45);
           pen.forward(35.3555339);
           pen.turnLeft(45);
           pen.turnLeft(90);
           pen.forward(25);
           pen.turnRight(90);
           pen.forward(50);
           pen.turnRight(90);
           pen.forward(75);
           pen.turnLeft(45);
           pen.forward(35.355339);
           pen.turnRight(45);
           pen.forward(250);
           pen.turnRight(90);
           pen.forward(150);
           pen.forward(50);
           pen.turnRight(90);
           pen.forward(150);
           pen.turnRight(90);
           pen.forward(100);
           pen.turnRight(90);
           pen.forward(150);
           
           
           
        }
      
    
    }
    public void palindrome()
   {
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
     
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("The string isn't a palindrome.");
         
   }
  

    
    public void drawBenzene(){
        DrawingTool pen;
     pen = new DrawingTool(new SketchPad(400, 400));
     
     pen.setWidth(3);
    
     
     pen.up();
     pen.move(-77, 130);
     pen.setDirection(0);
     pen.down();
     
     pen.forward(150);
     
     pen.turnRight(60);
     pen.forward(150);
     
     pen.turnRight(60);
     pen.forward(150);
     
     pen.turnRight(60);
     pen.forward(150);
     
     pen.turnRight(60);
     pen.forward(150);
     
     pen.turnRight(60);
     pen.forward(150);
     
     pen.up();
     pen.move(0, 0);
     pen.setWidth(2);
     pen.down();
     pen.drawCircle(100);
    }
    public void midtermQuestion(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println('\u000C');
        System.out.println("What direction do you start in when drawing?");
        System.out.println("up");
        System.out.println("down");
        System.out.println("right");
        System.out.println("left");
        
        String answer = keyboard.nextLine();
        
        if(answer.equals("up")){
            System.out.println("Correct!");
        
    }
    else{
        System.out.println("Incorrect, Sorry");
    }
}
    public void Question(){
        Scanner YEET = new Scanner(System.in);
        System.out.println('\u000C');
        System.out.println("What do you use to draw a straight line?");
        System.out.println("pen.turnRight()");
        System.out.println("pen.turnLeft()");
        System.out.println("pen.forward()");
        System.out.println("pen.drawCircle()");
        String answer = YEET.nextLine();
        if (answer.equals("pen.forward()")){
            System.out.println("Correct");
        }
        else{
            System.out.println("Incorrect!");
        }}
    

  
public void CountdownSong(){
{ // everything in Java is a class, we will learn more latter
    
    
     // code blocks are in curly braces {}
        // initialise control variables for program
        Scanner keyboard = new Scanner(System.in);
        String countdown;                 // integrer variable assignment, statements end in semi colon
        String bedJumpers;
        boolean intchecker;
        boolean stringchecker;
        
        // string of characters 
        System.out.println("Enter your jumper:");
        bedJumpers = keyboard.nextLine();
    
        
        System.out.println("\nEnter the number of jumpers:");
        countdown = keyboard.nextLine();
        

        // prepare for countdown loop
        int lmao = Integer.parseInt(countdown);
        int i = lmao;
        String space = " ";
        while (i > -1) { // while is a control flow statement, observe blocks of code

            if(i == 0){
                System.out.println("Zero little " + space+bedJumpers+" jumping on the bed");
            }else{
             
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
                System.out.println(i + space + "little" + space + bedJumpers + space + "jumping on the bed");
                System.out.println("One fell off and broke his head");
                System.out.println("Mama called the doctor and the doctor said");
                System.out.println("no more "+ bedJumpers+ " jumping on the bed.");
                
            
            }
            // decrement i at end of loop
            i--;  // this is equivalent to i = i - 1, -- is a shorthand
            
        }    
        
    }
}}
    

    
    

