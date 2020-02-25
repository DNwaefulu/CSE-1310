import java.util.Scanner;

public class CountMultiples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter an integer M: ");
        int M = in.nextInt();
        System.out.printf("Enter an integer N: ");
        int N = in.nextInt();
        int l = 0;
        
        for (int i = M; i <= N; i++)
        {
            if (i % 11 == 0)
            {
                l++;
            }
        }
        if (l == 1)
        {
            System.out.printf("%d number between %d and %d are multiples of 11.\n", l, M, N);
            System.out.printf("Exiting...");
        }
        else
        {
            System.out.printf("%d numbers between %d and %d are multiples of 11.\n", l, M, N);
            System.out.println("Exiting...");
        }
    }
    
}
