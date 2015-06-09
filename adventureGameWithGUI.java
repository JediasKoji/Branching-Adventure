import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adventureGameWithGUI{

   public static void main(String[] args) throws FileNotFoundException{
      Scanner intro = new Scanner(new File("AdventureIntro"));
      Scanner setting = new Scanner(new File("Setting"));
      Scanner console = new Scanner(System.in);
      Player pla = intro(console, intro, setting);
      int areaStart = 1;
    
      while(pla.isAlive()){
         Choice option = new Choice(areaStart);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(new Dimension(300, 125));
         frame.setTitle("Choice Adventure Game");
         
         JLabel question = new JLabel(option.askChoice());
         frame.add(question);
         
         JButton button1 = new JButton();
         button1.setText(option.presentChoice1());
         button1.setBackground(Color.RED);
         button1.addActionListener(new MessageListener());
         frame.add(button1);
         
         JButton button2 = new JButton();
         button2.setText(option.presentChoice2());
         button2.setBackground(Color.GREEN);
         button2.addActionListener(new MessageListener2());
         frame.add(button2);
         
         frame.pack();
         frame.setLayout(new FlowLayout());
         frame.setVisible(true);
         
         Scanner oneOrTwo = new Scanner (new File("OneorTwo.txt"));
         String a = oneOrTwo.nextLine();
         
         
         while(!(a.equals("1")) && !(a.equals("2"))){
            System.out.println("Please Enter 1 or 2");
            a = console.nextLine();
         }
         
         int added = Integer.parseInt(a);
         areaStart = option.getArea(added);
         
         pla.kill(option.getIsDead());
         if(pla.isAlive() == false){
            System.out.println("Nobody found the body. Try Again? Yes or No");
            String ans = console.nextLine();
            
            while(!(ans.equalsIgnoreCase("yes")) && !(ans.equalsIgnoreCase("no"))){
               System.out.println("Do you know how to spell? It's yes.. or no..");
               ans = console.nextLine();
            } 
            
            if(ans.equalsIgnoreCase("yes")){
               areaStart = 1;
               pla.revive();
            }
            else{
               System.out.println("Quite unfortunate.");
            }       
         }
      }
   }
  
   public static Player intro(Scanner console, Scanner intro, Scanner setting){
      while(intro.hasNextLine()){
         System.out.println(intro.nextLine());
      }
   
      String borg = console.nextLine();
      Player option = new Player(borg);
      while(setting.hasNextLine()){
         System.out.println(setting.nextLine());
      }
      return option;
   
   
   }
}