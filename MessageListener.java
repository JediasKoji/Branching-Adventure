import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MessageListener implements ActionListener{
   public void actionPerformed(ActionEvent event){
      try{
         PrintStream output = new PrintStream(new File("OneOrTwo.txt"));
         output.println("1");
      }
      catch(FileNotFoundException e){
      }
   }
}