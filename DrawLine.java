import java.awt.FlowLayout;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  
import java.awt.geom.*;
import java.awt.Graphics;    
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.SwingUtilities;
import javax.swing.JPanel; 
import java.awt.Container; 
import java.awt.Color;
import java.io.Console;
import java.util.Scanner;
import javax.swing.JTextField;
import java.util.Scanner;

public class DrawLine extends JPanel implements ActionListener  {
   private int errCode;
    public DrawLine()
    {
        // initialise instance variables
        errCode = 0;

    }
  public void paintComponent(Graphics g) {
       Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(500));
             
     //diagonal line 
     g2.setColor(Color.blue);
     g2.drawLine(0, 250, 500, 250);
     
     Graphics2D g3 = (Graphics2D) g;
                g3.setStroke(new BasicStroke(2));
     
     g3.setColor(Color.white);
     g3.drawLine(0, 170, 500, 170);
     
     g3.setColor(Color.white);
     g3.drawLine(0, 130, 500, 130);
     
     if(g instanceof Graphics2D)
      {
        Graphics2D g4 = (Graphics2D)g;
        g4.setFont(new Font("Bold",100,45));

     
        g4.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        //g.drawString is used to wite text in Java swing
        //the cordinates at the end represent the position on the J frame
        g4.drawString("Welcome to Jeopardy",15,80); 
        g4.setFont(new Font("Bold",15,15));
        g4.drawString("Catergory 1",20,160); 
        g4.drawString("Catergory 2",145,160); 
        g4.drawString("Catergory 3",280,160); 
        g4.drawString("Catergory 4",400,160); 
       }
 
  }
 
    public static void YOLO() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("Draw Line");
        f.setTitle("Jeopardy");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.white);
        f.setSize(500, 500);
     
        DrawLine panel = new DrawLine();
    
        f.add(panel);
     
        f.setVisible(true);
        
        JButton b=new JButton("Easy");//creating instance of JButton  
        b.setBounds(0,175,125, 75);//x axis, y axis, width, height  
              
        //ActionListenerExample ale = new ActionListenerExample();
        f.add(b);//adding button in JFrame  
        b.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                
                Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("Which of these was Mozart's middle name?");
                System.out.println("A Wolfgangus");
                System.out.println("B Homer");
                System.out.println("C Amadeus");
                System.out.println("D Johannes");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();
            }  
        });
        
         
        JButton a=new JButton("Easy");//creating instance of JButton  
        a.setBounds(125,175,125, 75);//x axis, y axis, width, height  
              
        f.add(a);//adding button in JFrame  
        a.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("On a clear night about how many galaxies are visible to the naked eye?");
                System.out.println("A Two");
                System.out.println("B Two Million");
                System.out.println("C Five thousand");
                System.out.println("D ninethousand");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();
            }  
        });
            
        JButton c=new JButton("Easy");//creating instance of JButton  
        c.setBounds(250,175,125, 75);//x axis, y axis, width, height  
          
        f.add(c);//adding button in JFrame  
        c.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                   Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("How many muscles do you have in total in all your fingers combined?");
                System.out.println("A 0");
                System.out.println("B 22");
                System.out.println("C 10");
                System.out.println("D 20");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();        
            }  
        });
        
        JButton d=new JButton("Easy");//creating instance of JButton  
        d.setBounds(375,175,125, 75);//x axis, y axis, width, height  
          
        f.add(d);//adding button in JFrame
        d.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                   Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("How many toes does a two toed sloth have?");
                System.out.println("A 6 or 8");
                System.out.println("B 2");
                System.out.println("C 0");
                System.out.println("D 10");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();        
            }  
        });
          
        JButton e=new JButton("Medium");//creating instance of JButton  
        e.setBounds(375,260,125, 75);//x axis, y axis, width, height  
          
        f.add(e);//adding button in JFrame  
        e.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                       Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("Which of the following characters are rabbits?");
                System.out.println("A Bugs Bunny");
                System.out.println("B Easter Bunny");
                System.out.println("C Brer Rabbit");
                System.out.println("D None they are all hares");
                String answer = YEET.nextLine();
                if (answer.equals("D")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();    
            }  
        });
        
        JButton h=new JButton("Medium");//creating instance of JButton  
        h.setBounds(250,260,125, 75);//x axis, y axis, width, height  
          
        f.add(h);//adding button in JFrame 
        h.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                   Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("How many man made artifacts on Earth can be seen from space?");
                System.out.println("A 1");
                System.out.println("B 0");
                System.out.println("C 6");
                System.out.println("D thousands");
                String answer = YEET.nextLine();
                if (answer.equals("D")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();        
            }  
        });
        
        JButton g=new JButton("Medium");//creating instance of JButton  
        g.setBounds(125,260,125, 75);//x axis, y axis, width, height  
          
        f.add(g);//adding button in JFrame  
        g.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                  //Write the code here  
                           Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("What was Billy the Kid's real first name?");
                System.out.println("A Henry");
                System.out.println("B William");
                System.out.println("C Bill");
                System.out.println("D Kidd");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();
            }  
        });
        JButton i=new JButton("Medium");//creating instance of JButton  
        i.setBounds(0,260,125, 75);//x axis, y axis, width, height  
          
        f.add(i);//adding button in JFrame  
        i.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                   Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("What kind of animal is the longest in the world?");
                System.out.println("A worm");
                System.out.println("B snake");
                System.out.println("C whale");
                System.out.println("D jellyfish");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();        
            }  
        });
        
        JButton j=new JButton("Hard");//creating instance of JButton  
        j.setBounds(375,345,125, 75);//x axis, y axis, width, height  
          
        f.add(j);//adding button in JFrame  
        j.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                           Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("Why is a marathon race distance 26 miles and 385 yards?");
                System.out.println("A For the Convience of the British royale family");
                System.out.println("B No one knows");
                System.out.println("C by accident");
                System.out.println("D it's the distance from greece to athens");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();
            }  
        });
        
        JButton k=new JButton("Hard");//creating instance of JButton  
        k.setBounds(250,345,125, 75);//x axis, y axis, width, height  
          
        f.add(k);//adding button in JFrame 
        a.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                           Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("Which eye did Lord Nelson wear his eye-patch on?");
                System.out.println("A He never wore an eye-patch");
                System.out.println("B His right");
                System.out.println("C His left");
                System.out.println("D It depended on his mood");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();
            }  
        });
        JButton l=new JButton("Hard");//creating instance of JButton  
        l.setBounds(125,345,125, 75);//x axis, y axis, width, height  
          
        f.add(l);//adding button in JFrame  
        l.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                          Scanner YEET = new Scanner(System.in);
                System.out.println('\u000C');
                System.out.println("Which of these species are the most murderous mammals?");
                System.out.println("A Chimpanzees");
                System.out.println("B Meerkats");
                System.out.println("C Elk");
                System.out.println("D Dogs");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();        
            }  
        });
        JButton m=new JButton("Hard");//creating instance of JButton  
        m.setBounds(0,345,125, 75);//x axis, y axis, width, height  
          
        f.add(m);//adding button in JFrame  
        m.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
                
            }  
        });  
        f.add(panel);
        
        JLabel o = new JLabel("Jeopardy");
        f.add(o); 
        
        f.setVisible(true);
        f.add(panel);

    }
    
    public void actionPerformed(ActionEvent e) {
        Scanner YEET = new Scanner(System.in);
        System.out.println('\u000C');
        System.out.println("Question");
        System.out.println("A");
        System.out.println("B");
                System.out.println("C");
                System.out.println("D");
                String answer = YEET.nextLine();
                if (answer.equals("A")){
                    System.out.println("Correct");
                }
                else{
                    System.out.println("Incorrect!");
        
        
                }
                System.out.println("Press any key to continue");
                Scanner w = new Scanner(System.in);
                String ee = w.nextLine();
                w.close();
    }
 
  }