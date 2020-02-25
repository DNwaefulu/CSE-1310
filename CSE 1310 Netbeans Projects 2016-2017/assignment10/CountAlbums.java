import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class CountAlbums
{
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
  
      public static ArrayList<String> read_spreadsheet(String filename)
    {
        ArrayList<String> lines = readFile(filename);
        if (lines == null)
        {
            return null;
        }
   
        ArrayList<String> result = new ArrayList<String>();
        String[] a = new String[2];
   
        for (int i = 0; i < lines.size(); i++)
        {
            String line = lines.get(i);
            a = line.split("-");
            result.add(a[0]);
        }
   
        return result;
     }
  
  public static void processFile(String filename)
  {
      ArrayList<String> albums = read_spreadsheet(filename);
      int count = 1;
      ArrayList<Integer> song = new ArrayList<Integer>();
      for(int i = 0; i < albums.size(); i++)
      {
          for(int j = i+1; j < albums.size(); j++)
          {
              if(albums.get(i).contains(albums.get(j)))
              {
                  count++;
                  albums.remove(j);
                  j--;
              }
          }
          song.add(count);
          count = 1;
      }
            while(albums.size() != 0)
            {
                int max = 0;
                int position = 0;
                
                for(int i = 0; i < song.size(); i++)
                {
                    if(max < song.get(i))
                    {
                        max = song.get(i);
                        position = i;
                    }
                }
                System.out.printf("%s: %d\n", albums.get(position), song.get(position));
                albums.remove(position);
                song.remove(position);
                
            }
      
  }

  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    while (true)
    {
      System.out.printf("Please enter the name of the input file, or q to quit: ");
      String input_name = in.nextLine();
      if (input_name.equals("q"))
      {
        break;
      }

      processFile(input_name);
      System.out.printf("\n");
    }
    
    System.out.printf("Exiting...\n");
  }
}