import java.io.File;
import java.util.*;

public class SumIntegers
{
    public static int sumIntegers(String filename)
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
      return 0;
    }

    ArrayList<String> result = new ArrayList<String>();
    int sum = 0;
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
      try
      {
          int number = Integer.parseInt(line);
          sum = sum + number;
      }
      catch (Exception e)
      {
          System.out.printf("");
      } 
    }
    
    input_file.close();
    return sum;
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.printf("Please enter the name of the input file: ");  
    String filename = in.nextLine();
 
    int result = sumIntegers(filename);
    System.out.printf("result = %d.\n", result);
  }
}