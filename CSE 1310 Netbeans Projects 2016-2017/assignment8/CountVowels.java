import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class CountVowels
{
    public static void countVowels(String in_file)
    {
        File location = new File(in_file);
        Scanner input_file = null;
        try
        {
            input_file = new Scanner(location);
        }
        catch (Exception e)
        {
            System.out.printf("Error in opening file for reading");
            System.exit(0);
        }
        ArrayList<String> line = new ArrayList<String>();
        while(input_file.hasNextLine())
        {
            String result = input_file.nextLine();
            line.add(result);
        }
        vowelArray(line);
    }
    
    public static int count(char v, String d)
    {
        int count = 0;
        d = d.toLowerCase();
        
        for(int i = 0; i < d.length(); i++)
        {
            if (v == d.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
    
    public static void vowelArray(ArrayList<String> line)
    {
        String plan = "";
        int[] counter = new int[5];
        for (int x = 0; x < line.size(); x++)
        {
            plan = plan + line.get(x);
        }
        
        char[] vowels = {'a','e','i','o','u'};
        for(int i = 0; i < vowels.length; i++)
        {
            counter[i] = count(vowels[i], plan);
            System.out.printf("%c: %d times\n", vowels[i], counter[i]);
        }
    }
  public static void main(String[] args)
  {
    countVowels("in5.txt");
  }
}  