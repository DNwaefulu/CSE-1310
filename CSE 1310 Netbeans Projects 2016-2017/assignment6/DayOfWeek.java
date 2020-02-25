import java.util.Scanner;

public class DayOfWeek
{
    public static int daysPassed(int year, int month, int day){
      int count = 0; 
      for (int i = 1000; i < year; i++)
      {
        count = count + year_days(i);   
      }
       for (int j = 1; j<month; j++)
       {
        count = count + month_days(year,j);   
       }
        count = count + day;
        return count;
       }
        
     public static boolean is_leap_year(int year){
      
      if (year % 100 == 0)
    {
        if (year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
     
    }
    else
    {
        if (year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     }
        
      public static int year_days(int year){
     if (is_leap_year(year))
     {
         return 366;
     }
        return 365;
    }
    
public static int month_days(int year, int month){
        
        if ( month == 1 )
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
    
    public static String dayOfWeek(int year, int month, int day)
    {
        int past = daysPassed(year, month, day);
    if (past % 7 == 0)
    {
        return "Tuesday"; 
    }
    else if (past % 7 == 1)
    {
        return "Wednesday";
    }
    else if (past % 7 == 2)
    {
        return "Thursday";
    }
    else if (past % 7 == 3)
    {
        return "Friday";
    }
    else if (past % 7 == 4)
    {
       return "Saturday";
    }
    else if (past % 7 == 5)
    {
        return "Sunday";
    }
    else 
    {
        return "Monday";
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
      int year = userInteger("Enter a year (must be >= 1000): ");      
      if (year < 1000)
      {
        System.out.printf("Invalid year.\n\n");
        continue;
      }

      int month = userInteger("Enter a month(must be between 1 and 12): ");
      if (month > 12)
      {
        System.out.printf("Invalid month.\n\n");
        continue;
      }
      
      int day = userInteger("Enter a day: ");
      
      int result = daysPassed(year, month, day);
      System.out.printf("%d days have passed from 12/31/999 to %d/%d/%d.\n", 
                        result, month, day, year);
      
      String day_name = dayOfWeek(year, month, day);
      System.out.printf("%d/%d/%d is a %s.\n\n", month, day, year, day_name);
    }
  }
}