import java.util.Scanner;

public class SkipMultiples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter low: ");
        int low = in.nextInt();
        System.out.printf("Enter high: ");
        int high = in.nextInt();
        
        if (low <= high)
        {
            for (int i = low; i <= high; i++)
            {
                if (i % 4 != 0)
                {
                    System.out.printf("%d\n", i);
                }
            }
        }
        else
        {
            System.out.println("no numbers found\n");
        }
    }
    
}
