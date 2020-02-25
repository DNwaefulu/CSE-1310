import java.util.Scanner;

public class Middles
{  
    public static double pickMiddle(double first, double second, double third)
    {
        if ((second <= first) && (first <= third))
        {
            return first;
        }
        else if ((third >= first) && (third <= second))
        {
            return third;
        }
        else 
        {
            return second;
        }
    }
  public static double userDouble(String message)
  {
    Scanner in = new Scanner(System.in);
    double result;
    while (true)
    {
      System.out.printf(message);
      String s = in.next();
      if (s.toLowerCase().equals("q"))
      {
        System.out.printf("Exiting...\n");
        System.exit(0);
      }

      try
      {
          result = Double.parseDouble(s);
      }
      catch (Exception e)
      {
          System.out.printf("%s is not a valid double.\n\n", s);
          continue;
      }
      return result;
    }
  }
  
  
  public static void main(String[] args)
  {
    while (true)
    {
      double first = userDouble("please enter the first number, or q to quit: ");
      double second = userDouble("please enter the second number, or q to quit: ");
      double third = userDouble("please enter the third number, or q to quit: ");
      double middle = pickMiddle(first, second, third);
      System.out.printf("the middle value is %.1f\n\n", middle);
    }
  }
}