import java.util.Scanner;

public class PrintCoded
{
    public static void printCoded(String word, String sources, String targets)
    {
        for (int i = 0; i < word.length(); i++)
        {
            char w = word.charAt(i);
            boolean letters = false;
        
        for (int j = 0; j < sources.length(); j++)
        {
            char q = sources.charAt(j);
            char z = targets.charAt(j);
            
            if (w == q)
            {
                System.out.printf("%c", z);
                letters = true;
                continue;
            }
        }
        if (!letters)
        {
            System.out.printf("%c", w);
        }
      }
    }
  
  
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    String sources = "abcdefghijklmnopqrstuvwxyz";
    String targets = "bcdefghijklmnopqrstuvwxyza";
    
    while (true)
    {
      System.out.printf("Enter some word, or q to quit: ");
      String word = in.next();
      if (word.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      printCoded(word, sources, targets);
      System.out.printf("\n\n");
    }
  }
}