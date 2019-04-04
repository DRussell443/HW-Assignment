import java.util.*;

public class backwardsStringThing {
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      String userinput;
   
      //  Scanner object created for user to out stuff in
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hello user, Please enter a word that you would like to be reversed.");
      
      userinput = keyboard.nextLine();
      
      StringBuilder putin = new StringBuilder();
      
      putin.append(userinput);
      
      putin = putin.reverse();
   
   //for loop
      for (int i = 0; i < putin.length(); i++)
         System.out.print(putin.charAt(i));
   }
}