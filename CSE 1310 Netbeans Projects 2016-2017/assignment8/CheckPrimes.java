import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

public class CheckPrimes
{
    public static void checkPrimes(String in_file, String out_file)
    {
        File temp = new File(in_file);
          Scanner input_file = null;
          try
          {
              input_file = new Scanner(temp);
          }
          catch (Exception e)
          {
              System.out.printf("Error in opening file for reading");
              System.exit(0);
          }
          ArrayList<String> line = new ArrayList<String>();
          while(input_file.hasNextLine())
          {
               line.add(input_file.nextLine());
          }
          input_file.close();
             
          PrintWriter out = null;
        try
        {
            out = new PrintWriter(out_file);
        }
        catch (Exception e)
        {
            System.out.printf("Error in opening file for writing.\n",out_file);
            System.exit(0);
        }
        for(int j = 0; j < line.size(); j++)
        {
            Scanner code = new Scanner(line.get(j));
            int N = code.nextInt();
            int c = 0;
            for(int i = 2; i < N; i++)
            {
                
                if (N % i == 0)
                {
                    c = 1;
                }
            }
               if(c == 0)
               {
                   out.printf("%d is prime.\r\n", N);
            }
               else
               {
                   out.printf("%d is not prime.\r\n", N);
               }
        }
        out.close();
    }

  public static void main(String[] args)
  {
    
    checkPrimes("in4.txt", "out4.txt");
    System.out.printf("Exiting...\n");
  }
}  