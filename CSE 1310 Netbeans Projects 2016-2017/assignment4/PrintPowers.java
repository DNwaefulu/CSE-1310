import java.util.Scanner;

public class PrintPowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a positive integer N > 1: ");
        double N = in.nextDouble();
        double M = 0;
        double O = 0;
        
        if (N > 1)
        {
            for (int i = 0; O <= 40000; i++)
            {
                M = Math.pow(N, i);
                O = Math.pow(N, i+1);
                System.out.printf("%.0f\n", M);
            }
            System.out.printf("Exiting...\n");
        }
        else
        {
            System.out.printf("Exiting...\n");
        }
    }
    
}
