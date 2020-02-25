import java.io.File;
import java.util.*;

public class SortByLength
{
    public static ArrayList<String> sortByLength(ArrayList<String> input_list)
    {
        ArrayList<String> result = new ArrayList<String>(input_list);
        for(int i = 0; i < result.size(); i++)
        {
            for(int j = i+1; j < result.size(); j++)
            {
                String p = result.get(i);
                int first = p.length();
                
                String l = result.get(j);
                int next = l.length();
                
                if(next < first)
                {
                    result.set(j, p);
                    result.set(i, l);
                }
            }
                
        }
        return result;
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
    
    ArrayList<String> output_list = sortByLength(input_list);
    System.out.printf("Input:  ");
    System.out.println(input_list);
    System.out.printf("Output: ");
    System.out.println(output_list);  
  }
}