import java.util.Scanner;

public class Binary
{
  public static int binaryToDecimal(String text)
  {
    // handle minus sign at the front.
    int sign = 1;
    if (text.charAt(0) == '-')
    {
      sign = -1;
      text = text.substring(1);
    }
    int result = 0;
    String digits = "01";
    for (int i = 0; i < text.length(); i++)
    {
      String c = text.substring(i, i+1);
      int digit = digits.indexOf(c);
      if (digit == -1)
      {
        System.out.printf("Error: invalid binary number %s, exiting...\n", text);
        System.exit(0);
      }
      int power = (int) (Math.pow(2, text.length() - i - 1));
      result = result + digit * power;
    }
    
    // if the first character of text was a minus, then negate the result.
    result = sign * result;
    return result;
  }
  
  public static String decimalToBinary(int number)
  {
    // handle case where number is negative
    String start = "";
    if (number < 0)
    {
      start = "-";
      number = -number;
    }
    
    String result = "";
    while(true)
    {
      int remainder = number % 2;
      String digit = Integer.toString(remainder);
      result = digit + result;
      number = number / 2;
      if (number == 0)
      {
        break;
      }
    }
    
    // if number is negative, put a minus sign in front of the result.
    result = start + result;
    return result;
  }


  public static boolean checkValid(String text)
  {
    // should have nonzero length
    if (text.length() == 0)
    {
      return false;
    }
    // should only have characters 0, 1, +, -.
    int counter = 0; // will count occurrences of + and - characters
    for (int i = 0; i < text.length(); i++)
    {
      char c = text.charAt(i);
      if ("01+-".indexOf(c) < 0)
      {
        return false;
      }      
      if ("+-".indexOf(c) >= 0)
      {
        counter++;
      }
    }
      
    // should only have one occurrence of a + or - character
    if (counter != 1)
    {
      return false;
    }
    
    // the operator (+ or - character) should not be at the beginning
    // or end of the string
    char start = text.charAt(0);
    char end = text.charAt(text.length() - 1);
    if ("01".indexOf(start) < 0)
    {
      return false;
    }
    if ("01".indexOf(end) < 0)
    {
      return false;
    }
              
    return true;
  }

  
  public static int findOperatorPosition(String text)
  {
      int count = 0;
      int i;
      for(i = 0; i < text.length(); i++)
      {
          if (text.charAt(i) == '+')
          {
              break;
          }
          
          else if (text.charAt(i) == '-')
          {
              break;
          }
      }
      return i;
  }
  
  public static char findOperatorSymbol(String text)
  {
      char value = ' ';
      int count = 0;
      
      for(int i = 0; i < text.length(); i++)
      {
          char sign = text.charAt(i);
          int p = '+';
          int m = '-';
          
          if (sign == p)
          {
              value = '+';
          }
          else if (sign == m)
          {
              value = '-';
          }
      }
      return value;
  }
  
  public static String getFirstNumber(String text)
  {
      String first = "";
      String plus = "+";
      String minus = "-";
      
      int p = plus.indexOf(text);
      int k = minus.indexOf(text);
      int o = findOperatorPosition(text);
      
      first = text.substring(0,o);
      return first;
  }
  
  public static String getSecondNumber(String text)
  {
      String second = "";
      String plus = "+";
      String minus = "-";
      
      int p = plus.indexOf(text);
      int k = minus.indexOf(text);
      int o = findOperatorPosition(text);
      
      second = text.substring(o + 1, text.length());
      return second;
  }
  
  public static String computeBinaryOperation(String text)
  {
      String result = "";
      String F = getFirstNumber(text);
      String S = getSecondNumber(text);
      char O = findOperatorSymbol(text);
      int B = binaryToDecimal(F);
      int D = binaryToDecimal(S);
      int L = 0;
      
      if (O == '+')
      {
          L = B + D;
      }
      else if (O == '-')
      {
          L = B - D;
      }
      result = decimalToBinary(L);
    return result;
  }
  
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      System.out.printf("Please enter your input, or q to quit: ");
      String text = in.nextLine();      
      if (text.toLowerCase().equals("q"))
      {
        break;
      }
      if (checkValid(text) == false)
      {
        System.out.printf("Error: invalid input, please try again.\n\n");
        continue;
      }
      
      int position = findOperatorPosition(text);
      char symbol = findOperatorSymbol(text);
      String first = getFirstNumber(text);
      String second = getSecondNumber(text);
      String result = computeBinaryOperation(text);
      System.out.printf("operator position = %d\n", position);
      System.out.printf("operation = %c\n", symbol);
      System.out.printf("the first number is %s\n", first);
      System.out.printf("the second number is %s\n", second);
      System.out.printf("result = %s\n\n", result);
    }
    System.out.println("Exiting...");
  }
}