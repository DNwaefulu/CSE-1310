import java.io.File;
import java.util.*;

public class InsertBeforeLonger
{
    public static void insertBeforeLonger(ArrayList<String> a, String x)
    {
        a.add(x);
        String word;
        for(int i = a.size() - 1; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                word = a.get(j);
                x = a.get(j+1);
                int letter = word.length();
                int choice = x.length();
                
                if(letter > choice)
                {
                    a.set(j, x);
                    a.set(j+1, word);
                }
            }
            
        }
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
    ArrayList<String> input_list = readFile(filename);
    
    if (input_list == null)
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    
    ArrayList<String> output_list = new ArrayList<String>();
    for (int i = 0; i < input_list.size(); i++)
    {
      String item = input_list.get(i);
      insertBeforeLonger(output_list, item);
      System.out.println(output_list);
    }  
  }
}   