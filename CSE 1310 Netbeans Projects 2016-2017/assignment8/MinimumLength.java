import java.io.File;
import java.util.*;

public class MinimumLength
{
    public static int findMinimumLength(ArrayList<String> a)
    {
        if(a.size() == 0)
        {
            return -1;
        }
        
        int position = 0;
        int min = 20;
        for(int i = 0; i < a.size(); i++)
        {
            String word = a.get(i);
            if(word.length() < min)
            {
                min = word.length();
                position = i;
            }
        }
        return position;
    }
    
    public static void removeMinimumLength(ArrayList<String> a)
    {
        int word = findMinimumLength(a);
        a.remove(word);
    }

  public static ArrayList<String> readFile(String filename)
  {
    File temp = new File(filename);
    Scanner input_file;
    try
    {
      input_file = new Scanner(temp);
    }
    catch (Exception e)
    {
      System.out.printf("Failed to open file %s\n",
                        filename);
      return null;
    }

    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    
    input_file.close();
    return result;
  } 

  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("Please enter the name of the input file: ");
    String filename = in.nextLine();
    ArrayList<String> a = readFile(filename);
    if (a == null)
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    
    while(true)
    {
      System.out.println(a);
      int position = findMinimumLength(a);
      System.out.printf("minimum position = %d\n\n", position);
      if (a.size() == 0)
      {
        break;
      }
      removeMinimumLength(a);
    }
 }
}