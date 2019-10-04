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
        });
        
         
        JButton a=new JButton("Easy");//creating instance of JButton  
        a.setBounds(125,175,125, 75);//x axis, y axis, width, height  
              
        f.add(a);//adding button in JFrame  
        a.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
            
        JButton c=new JButton("Easy");//creating instance of JButton  
        c.setBounds(250,175,125, 75);//x axis, y axis, width, height  
          
        f.add(c);//adding button in JFrame  
        c.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
        
        JButton d=new JButton("Easy");//creating instance of JButton  
        d.setBounds(375,175,125, 75);//x axis, y axis, width, height  
          
        f.add(d);//adding button in JFrame
        d.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
          
        JButton e=new JButton("Medium");//creating instance of JButton  
        e.setBounds(375,260,125, 75);//x axis, y axis, width, height  
          
        f.add(e);//adding button in JFrame  
        e.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
        
        JButton h=new JButton("Medium");//creating instance of JButton  
        h.setBounds(250,260,125, 75);//x axis, y axis, width, height  
          
        f.add(h);//adding button in JFrame 
        h.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
        
        JButton g=new JButton("Medium");//creating instance of JButton  
        g.setBounds(125,260,125, 75);//x axis, y axis, width, height  
          
        f.add(g);//adding button in JFrame  
        g.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                  //Write the code here  
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
        });
        JButton i=new JButton("Medium");//creating instance of JButton  
        i.setBounds(0,260,125, 75);//x axis, y axis, width, height  
          
        f.add(i);//adding button in JFrame  
        i.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
        
        JButton j=new JButton("Hard");//creating instance of JButton  
        j.setBounds(375,345,125, 75);//x axis, y axis, width, height  
          
        f.add(j);//adding button in JFrame  
        j.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
        
        JButton k=new JButton("Hard");//creating instance of JButton  
        k.setBounds(250,345,125, 75);//x axis, y axis, width, height  
          
        f.add(k);//adding button in JFrame 
        a.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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
        });
        JButton l=new JButton("Hard");//creating instance of JButton  
        l.setBounds(125,345,125, 75);//x axis, y axis, width, height  
          
        f.add(l);//adding button in JFrame  
        l.addActionListener(new ActionListenerExample(){
            public void actionPerformed(ActionEvent e){  
                //Write the code here  
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