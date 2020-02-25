import java.util.Scanner;

public class MonthsToNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter the name of the month: ");
        String month = in.next();
        String m = month.toLowerCase();
        
        if (m.equals("january"))
        {
            System.out.printf("January is the first month.\n");
        }
        else if (m.equals("february"))
        {
            System.out.printf("February is the second month.\n");
        }
        else if (m.equals("march"))
        {
            System.out.printf("March is the third month.\n");
        }
        else if (m.equals("april"))
        {
            System.out.printf("April is the fourth month.\n");
        }
        else if (m.equals("may"))
        {
            System.out.printf("May is the fifth month.\n");
        }
        else if (m.equals("june"))
        {
            System.out.printf("June is the sixth month.\n");
        }
        else if (m.equals("july"))
        {
            System.out.printf("July is the seventh month.\n");
        }
        else if (m.equals("august"))
        {
            System.out.printf("August is the eighth month.\n");
        }
        else if (m.equals("september"))
        {
            System.out.printf("September is the ninth month.\n");
        }
        else if (m.equals("october"))
        {
            System.out.printf("October is the tenth month.\n");
        }
        else if (m.equals("november"))
        {
            System.out.printf("November is the eleventh month.\n");
        }
        else if (m.equals("december"))
        {
            System.out.printf("December is the twelfth month.\n");
        }
        else
        {
            System.out.printf("Unknown month: %s.\n", month);
        }
    }
    
}
