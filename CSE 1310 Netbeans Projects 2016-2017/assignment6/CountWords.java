import java.util.Scanner;

public class CountWords
{
    public static int countWords(String text)
    {
        if (text.length() == 0)
        {
            return 0;
        }
        
        int counter = 0;
        if (text.charAt(0) != ' ')
        {
            counter = 1;
        }
        
        for(int i = 1; i < text.length(); i++)
        {
            char o = text.charAt(i);
            char y = text.charAt(i - 1);
            
            if (o != ' ')
            {
                if (y == ' ')
                {
                    counter++;
                }
            }
        }
        return counter;
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
        break;
      }
      int result = countWords(text);
      System.out.printf("Counted %d words.\n\n", result);
    }
  }
}