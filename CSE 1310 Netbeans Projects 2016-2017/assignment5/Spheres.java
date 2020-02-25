import java.util.Scanner;

public class Spheres
{
  public static double sphereVolume(double radius)
  {
      double volume = ((4.0/3) * Math.PI * Math.pow(radius, 3));
      return volume;
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
          System.out.printf("%s is not a valid double.\n\n.", s);
          continue;
      }
      
      if (result < 1)
      {
          System.out.printf("%.6f is not positive.\n\n", result);
          continue;
      }

      return result;
    }
  }
  
  public static void main(String[] args)
  {
    while(true)
    {
      double r = userDouble("Please enter a radius >= 0, or q to quit: ");
      
      double volume = sphereVolume(r);
      System.out.printf("Volume = %.2f.\n\n", volume);
    }
  }
}
