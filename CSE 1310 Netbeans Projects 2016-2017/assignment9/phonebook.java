import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

public class phonebook
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

    ArrayList<String> result = new ArrayList<String>();
    while(input_file.hasNextLine())
    {
      String line = input_file.nextLine();
      result.add(line);
    }
    
    input_file.close();
    return result;
  } 

        public static String[][] readSpreadsheet(String filename)
    {
        ArrayList<String> lines = read_file(filename);
        if (lines == null)
            {
                return null;
            }
        
        
   String[][] result = new String[lines.size()][];
   
   for (int i = 0; i < lines.size(); i++)
   {
     String line = lines.get(i);
     result[i] = line.split(","); 
   }
   return result;
 }
    public static String[][] readPhonebook()
    {
        String filename = "phonebook.txt";
        String[][] lines = readSpreadsheet(filename);
        return lines;
    }
    
    public static void savePhonebook(String[][] data, String new_name, String new_number)
    {
        String filename = "phonebook.txt";
        PrintWriter out = null;
        try
        {
            out = new PrintWriter(filename);
        }
        catch (Exception e)
        {
            System.out.printf("Error: failed to open file %s. \n", filename);
            return;
        }
        for(int i = 0; i < data.length; i++)
        {
            String g = data[i][0];
            String h = data[i][1];
            out.printf("%s, %s\r\n", g, h);
        }
        out.printf("%s, %s\r\n", new_name, new_number);
        out.close();
    }
    
    public static void printSpreadsheet(String[][] data)
    {
        for(int i =0; i < data.length; i++)
        {
            System.out.printf("%4d: %20s, %4s\n",i, data[i][0], data[i][1]);
        }
    }
    
    public static void searchData(String[][] data)
    {
        Scanner in = new Scanner (System.in);
        System.out.printf("Please enter a name: ");
        String name = in.nextLine();
        name = name.toLowerCase();
            
            for(int i = 0; i < data.length; i++)
            {
                String n = data[i][0].toLowerCase();
                if(n.indexOf(name) != -1)
                {
                    System.out.printf("%20s, %s\n", data[i][0], data[i][1]);
                }
            }
 
        }
        
    

  public static String[][] inputNewEntry(String[][] data)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("\nEnter a name: ");
    String name = in.nextLine();
    System.out.printf("\nEnter a number: ");
    String number = in.nextLine();
    savePhonebook(data, name, number);
    data = readPhonebook();
    return data;
  }  
  
  
  public static String[][] processOption(String[][] data, String option)
  {
    if (option.equals("1"))
    {
      printSpreadsheet(data);
    }
    else if (option.equals("2"))
    {
      data = inputNewEntry(data);
    }
    else if (option.equals("3"))
    {
      searchData(data);
    }
    else if (option.equals("q"))
    {
      System.out.printf("Exiting...\n");
      System.exit(0);
    }
    else
    {
      System.out.printf("Unrecognized option %s.\n", option);
    }
    
    return data;
  }
  
  public static String askOption()
  {
    Scanner in = new Scanner(System.in);
    
    System.out.printf("\n1: Print phonebook.\n");
    System.out.printf("2: Input a new entry.\n");
    System.out.printf("3: Search by name.\n");
    System.out.printf("q: Quit program.\n");
    System.out.printf("Please enter an option: ");
    String option = in.next();
    return option;
  }

  
  public static void main(String[] args)
  {
    String[][] data = readPhonebook();
    printSpreadsheet(data);

    while(true)
    {
      String option = askOption();
      data = processOption(data, option);
    }
  }
  
}