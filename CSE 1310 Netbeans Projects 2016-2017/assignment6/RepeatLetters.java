import java.util.Scanner;

public class RepeatLetters
{
    public static String repeatLetters(String text, int times)
    {
        String n = "";
        
        for (int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);
            int number = text.indexOf(letter);
            
            for (int o = 0; o < times; o++)
            {
                n = n + letter;
            }
        }
        System.out.printf("%s", n);
        return text;
    }
  
  public static int userInteger(String message)
  {
    Scanner in = new Scanner(System.in);
    int result;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      try
      {
        result = Integer.parseInt(s);
      } 
      catch (Exception e)
      {
        System.out.printf("%s is not a valid number, try again.\n\n", s);
        continue;
      }
      
      if (result <= 0)
      {
        System.out.printf("%s is <= 0, try again.\n\n", s);
        continue;
      }
      return result;
    }
  }
  
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Enter some text, or q to quit: ");
      String text = in.nextLine();
      if (text.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      
      int times = userInteger("Enter number of times (must be > 0): ");
      
      repeatLetters(text, times);
      System.out.printf("\n\n");
    }
  }
}