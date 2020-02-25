import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a positive integer N > 0: ");
        int N = in.nextInt();
        
        if (N > 0)
        {
            for (int i = 0; i < N; i++)
            {
                for (int d = 0; d <= i; d++)
                {
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
            System.out.printf("Exiting...\n");
        }
        else
        {
            System.out.printf("Exiting...\n");
        }
    }
    
}
