import java.io.PrintWriter;
import java.util.*;
import java.io.File;

public class PrintPlayerInfo
{
    public static void printPlayerInfo(String[][] data, String player)
    {
        try
        {    
            for(int i = 1; i < data.length; i++)
              {
                    String p = player.toLowerCase();
                    String names = data[i][0].toLowerCase(); 
            
                if(names.indexOf(p) != -1)
                {
                    try
                    {
                        for(int j = 0; j < data[0].length; j++)
                        {
                           String stats = data[i][j];

                            {
                                System.out.printf("%21s: %s\n",data[0][j], stats);
                            } 

                        }
                            System.out.printf("\n");
                    }
                    
                    catch (Exception e)
                    {
                       break;                    
                    }
                }

              }
        }
        
        catch (Exception e)
        {
            System.out.printf("Not data has been loaded\n");
            
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
    
    public static String[][] readSpreadsheet(String filename)
    {
        ArrayList<String> lines = readFile(filename);
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


  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    while (true)
    {
      System.out.printf("\nEnter the name of a file to read: ");
      String filename = in.next();
      String[][] data = readSpreadsheet(filename);
      System.out.printf("\nEnter part of a player's name (or q to quit): ");
      String player = in.next();
      if (player.equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }
      printPlayerInfo(data, player);
    }
      
  }
}