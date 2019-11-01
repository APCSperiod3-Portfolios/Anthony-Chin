 
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
     private static int getMenu(){ //presents menu to user and prompts user to choose which project to see
       int choice = 0;
       Scanner keyboard = new Scanner(System.in);
       Keyinput.printPrompt("What would you like to see\n");
        Keyinput.printPrompt("Press 1 for House\n");
        Keyinput.printPrompt("Press 2 for  a Question 1 about drawing Objects\n");
        Keyinput.printPrompt("Press 3 for Benzene drawing\n");
        Keyinput.printPrompt("Press 4 for Logo drawing\n");
        Keyinput.printPrompt("Press 5 for Monkey Song\n");
        Keyinput.printPrompt("Press 6 for Question 2 about drawing Object\n");
        Keyinput.printPrompt("Press 7 for Palindrome\n");
        Keyinput.printPrompt("Press 8 for Jeopardy\n");
        Keyinput.printPrompt("Press 9 for Knight lab\n");
        Keyinput.printPrompt("Press 10 for Calculator\n");
        Keyinput.printPrompt("Press 11 for Palindrome Replace\n");
        Keyinput.printPrompt("Press 12 for Palindrome recursion\n");
       choice = keyboard.nextInt();
       return choice;
}
   
   public static void main(String [] args){
       Scanner keyboard = new Scanner (System.in);
       System.out.print('\u000C');
       System.out.println("Hello welcome to Anthony's Portfolio!");
       int choice = getMenu();
       Portfolio runner = new Portfolio();
       //System.out.println("Your choice is: "+choice);
       while(choice != 0){
    if(choice==1){
                runner.DrawOutline();
            }
            else if(choice==2){
                runner.midtermQuestion();
        
            
            }
            else if (choice==3){
               runner.drawBenzene ();
             
            }
            else if (choice==4){ 
                CreateLogo temp = new CreateLogo();
                
                temp.main();
            }
            else if (choice==5){
                runner.CountdownSong();
                
            }
            else if (choice==6){
                runner.Question();
            }
            else if (choice==7){
                runner.palindrome();
            }
               
            else if (choice==8){
                DrawLine temp = new DrawLine();
                temp.YOLO();
            }
            else if (choice==9){
                Knight hi = new Knight();
                hi.printTour();
                
                Keyinput.printPrompt("The code doesn't work in portfolio use seperatley to run program.");
                
            }
             else if (choice==10){
                F lol = new F();
                lol.main();
            }
            else if (choice==11){
                PalindromeReplace yee = new PalindromeReplace();
                yee.run();
            }
            else if (choice==12){
                Palindrome_recursion hi = new Palindrome_recursion();
                hi.main_Palindrome_recursionStatic();
            }
       choice = getMenu(); //allows you to rechose an option on the menu
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
     
      Keyinput.printPrompt("Enter a string to check if it is a palindrome");
      original = in.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         Keyinput.printPrompt("The string is a palindrome.");
      else
         Keyinput.printPrompt("The string isn't a palindrome.");
         
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
        Keyinput.printPrompt("What direction do you start in when drawing?");
        Keyinput.printPrompt("up");
        Keyinput.printPrompt("down");
        Keyinput.printPrompt("right");
        Keyinput.printPrompt("left");
        
        String answer = keyboard.nextLine();
        
        if(answer.equals("up")){
            Keyinput.printPrompt("Correct!");
        
    }
    else{
        Keyinput.printPrompt("Incorrect, Sorry");
    }
}
    public void Question(){
        Scanner YEET = new Scanner(System.in);
        System.out.println('\u000C');
        Keyinput.printPrompt("What do you use to draw a straight line?");
        Keyinput.printPrompt("pen.turnRight()");
        Keyinput.printPrompt("pen.turnLeft()");
        Keyinput.printPrompt("pen.forward()");
        Keyinput.printPrompt("pen.drawCircle()");
        String answer = YEET.nextLine();
        if (answer.equals("pen.forward()")){
            Keyinput.printPrompt("Correct");
        }
        else{
            Keyinput.printPrompt("Incorrect!");
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
        Keyinput.printPrompt("Enter your jumper:");
        bedJumpers = keyboard.nextLine();
    
        
        Keyinput.printPrompt("\nEnter the number of jumpers:");
        countdown = keyboard.nextLine();
        

        // prepare for countdown loop
        int lmao = Integer.parseInt(countdown);
        int i = lmao;
        String space = " ";
        while (i > -1) { // while is a control flow statement, observe blocks of code

            if(i == 0){
                Keyinput.printPrompt("Zero little " + space+bedJumpers+" jumping on the bed");
            }else{
             
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
                Keyinput.printPrompt(i + space + "little" + space + bedJumpers + space + "jumping on the bed");
                Keyinput.printPrompt("One fell off and broke his head");
                Keyinput.printPrompt("Mama called the doctor and the doctor said");
                Keyinput.printPrompt("no more "+ bedJumpers+ " jumping on the bed.");
                
            
            }
            // decrement i at end of loop
            i--;  // this is equivalent to i = i - 1, -- is a shorthand
            
        }    
        
    }
}}
    

    
    

