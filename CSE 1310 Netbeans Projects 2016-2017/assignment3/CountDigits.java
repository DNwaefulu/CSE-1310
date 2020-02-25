import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please enter an integer: ");
        int n = in.nextInt();
        String d = Integer.toString(n);
        int l = d.length();
        
        if (n < 0)
        {
            System.out.printf("%d is negative.\n", n);
        }
        else if ((0 <= n) && (n < 1000000))
        {
            if (l == 1)
            System.out.printf("%d has one digit.\n", n,l);
            if (l == 2)
            System.out.printf("%d has two digits.\n", n,l);
            if (l == 3)
            System.out.printf("%d has three digits.\n", n,l);
            if (l == 4)
            System.out.printf("%d has four digits.\n", n,l);
            if (l == 5)
            System.out.printf("%d has five digits.\n", n,l);
            if (l == 6)
            System.out.printf("%d has six digits.\n", n,l);
        }
        else
        {
            System.out.printf("%d has more than six digits.\n", n);
        }
    }
    
        
}
