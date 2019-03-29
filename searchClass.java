/* This code will search up classes
 based on what the user has entereed
 **/

import java.util.Scanner;
public class searchClass{
   public static void main(String[] args){
      String lookUp; //To look up a Sting
      
   
   // This creates an array if names.
      String[] classes = { "COSC 220", "MATH 203", "PHSC 214", "SOCI 516" +
                    "MATH 250"};
   
   //Scanner Object 
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the first few characters of " +
         "the class name to look up: ");
   
      lookUp = keyboard.nextLine();
   
   //This part if the code will show the all of the names that are
   //correllated to the class entered user.
   
      System.out.println("Here are the classes that match:");
      for (String credits : classes ){
      
         if (credits.startsWith(lookUp))
            System.out.println(credits);
      
      } 
   }
}