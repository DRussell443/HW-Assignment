import java.util.Scanner;

public class wordCounter
{

    public static void main(String[] args)
    {
    String N = getInput();
    int count = 0;
    //method call
     count = getWordCount(userinput);
     System.out.println("The number of words in the string are: " + count);

 
        }

       
        public static String getInput()
        {
            String userinput;
            
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a string here: ");
            userinput = in.nextLine();

            
            if(userinput.length() > 0)
            {
                
                
            }
            else
            {
                System.out.println("That is not a string");
                System.out.println("Enter a string ");
                userinput = in.nextLine();
            }

            return userinput;
            
            if(userinput.length() > 0)
{
    getInput(userinput);    // getWordCount(input);
}

        }   //Close public static string getInput here

        //
        //Calculates the number of words the user inputs
       
        public static int getWordCount(String userinput)
        {
            int wordcount = 0;  

            for(int i = 0;  i  <= userinput.length() -1; i++)
                {
                    if(userinput.charAt(i) == ' ' )
                    {
                        wordcount++;
                    }
                }

                return wordcount;
                }
         
       
 
        


}