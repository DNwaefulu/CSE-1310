import java.util.*;
import java.io.File;

public class MonthlyAverage
{
      public static ArrayList<String> read_file(String filename)
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

    ArrayList<String> result = new ArrayList();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    input_file.close();
    
    return result;
  } 
    public static String columnName(String filename, int column)
    {
        File temp = new File(filename);
        Scanner input;
        try
        {
            input = new Scanner(temp);
        }
        catch (Exception e)
        {
            System.out.printf("Failed to open file %s\n", filename);
            return null;
        }
        
        String line = input.nextLine();
        
        String[] columns = line.split(",");
        
        int n = column;
        if(n > -1 && n < columns.length)
        {
            return columns[n];
        }
        return null;
    }
    
      public static double monthlyAverage(String filename, int column, int month)
        {
            File temp = new File(filename);
            Scanner input;
            try
            {
                input = new Scanner(temp);
            }
            catch (Exception e)
            {
                System.out.printf("Failed to open file %s\n", filename);
                return 0;
            }
            
            double average = 0;
            int count = 0;
            
            if(input.hasNextLine()) //Reads the first line that has the labels of the columns
            {
                input.nextLine();
            }
            
            while(input.hasNextLine())
            {
                String lines = input.nextLine();
                String[] d; 
                String[] m;
                int result;
                try
                {
                    d = lines.split(" ");
                    m = d[1].split("/");
                    result = Integer.parseInt(m[0]);
                }
                catch (Exception e)
                {
                    continue;
                }
                
                if(result == month)
                {
                    String[] columns = lines.split(",");
                    int n = column;
                    if(n > -1 && n < columns.length)
                    {
                        average += Double.parseDouble(columns[n]);
                        count++;
                    }
                    
                }
                
            }
            if (count == 0)
            {
                return -1;
            }
            average = average / count;
            return average;
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
      
      return result;
    }
  }  
  
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    while (true)
    {
      System.out.printf("Enter a filename (or q to quit): ");
      String filename = in.next();
      if (filename.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      int column = userInteger("Enter a column: ");
      String name = columnName(filename, column);
      if (name == null)
      {
        System.out.printf("Failed to extract a valid column name for column %d of %s\n\n",
                          column, filename);
        continue;
      }
      int month = userInteger("Enter a month: ");
      
      double average = monthlyAverage(filename, column, month);
      if (average == -1.00)
      {
        System.out.printf("In file %s, there is no data for %s for month %d.\n\n",
                          filename, name, month);
      }
      else
      {
        System.out.printf("In file %s, the average %s for month %d is %.2f.\n\n",
                          filename, name, month, average);
      }
    }
  }
}