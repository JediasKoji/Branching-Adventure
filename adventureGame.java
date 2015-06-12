import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class adventureGame{

   public static void main(String[] args) throws FileNotFoundException{
      Scanner intro = new Scanner(new File("AdventureIntro"));
      Scanner setting = new Scanner(new File("Setting"));
      Scanner console = new Scanner(System.in);
      Player pla = intro(console, intro, setting);
      int areaStart = 1;
    
      while(pla.isAlive()){
         ChoiceOriginal option = new ChoiceOriginal(areaStart);
         option.askChoice();
       
         String a = console.nextLine();
       
         while(!(a.equals("1")) && !(a.equals("2"))){
            System.out.println("Please Enter 1 or 2");
            a = console.nextLine();
         }
         int added = Integer.parseInt(a);
         areaStart = option.getArea(added);
         
         if(option.getWin()){
            win(pla);
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
         else{
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
   
   public static void win(Player pla){
      System.out.println("Congratulations" + pla.getName());
      System.out.println("You have beaten our mildly amazing, unbelievably mediocre game.");
      System.out.println("Good Job. You get a sticker... An imaginary one.");
      System.out.println("Play again?");
   }
}