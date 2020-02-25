import java.util.Scanner;

public class MonthDays
{
    public static boolean is_leap_year(int years)
    {
        if (years % 100 == 0)
        {
            if (years % 400 == 0)
            {
                return true;
            }
        }
        else
        {
            if (years % 4 == 0)
            {
                return true;
            }
        }
        return false;
    }
    
    public static int yearDays(int year)
    {
        if (is_leap_year(year))
        {
            return 366;
        }
        return 365;
    }
    
    public static int monthDays(int year, int month)
    {
        if (month == 1)
        {
            return 31;
        }
        else if (month == 2)
        {
            if (is_leap_year(year))
            {
                return 29;
            }
            else
            {
                return 28;
            }
        }
        else if (month == 3)
        {
            return 31;
        }
        else if (month == 4)
        {
            return 30;
        }
        else if (month == 5)
        {
            return 31;
        }
        else if (month == 6)
        {
            return 30;
        }
        else if (month == 7)
        {
            return 31;
        }
        else if (month == 8)
        {
            return 31;
        }
        else if (month == 9)
        {
            return 30;
        }
        else if (month == 10)
        {
            return 31;
        }
        else if (month == 11)
        {
            return 30;
        }
        else
        {
            return 31;
        }
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
      
      if (result <= 0)
      {
        System.out.printf("%s is <= 0, try again.\n\n", s);
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
      int year = userInteger("Enter a year (must be > 0): ");      
      int month = userInteger("Enter a month (must be between 1 and 12): ");
      if (month > 12)
      {
        System.out.printf("Invalid month.\n\n");
        continue;
      }

      int result = yearDays(year);
      int result2 = monthDays(year, month);

      System.out.printf("Year %d has %d days.\n", year, result);
      System.out.printf("Month %d, %d has %d days.\n\n", month, year, result2);
    }
  }
}