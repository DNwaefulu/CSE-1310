import java.util.Scanner;

public class DivisibilityTests {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter an integer: ");
        int input = in.nextInt();
    
        if (input < 0)
        {
            System.out.printf("The number is negative.\n");
        }
        else if ((input % 2 == 0) && (input % 3 == 0))
        {
            System.out.printf("The number is even and divisible by 3.\n");
        }
        else if ((input % 2 == 0) && (input % 3 != 0))
        {
            System.out.printf("The number is even and not divisible by 3.\n");
        }
        else if ((input % 2 != 0) && (input % 3 == 0))
        {
            System.out.printf("The number is odd and divisible by 3.\n");
        }
        else
        {
            System.out.printf("The number is odd and not divisible by 3.\n");
        }
    }
}
