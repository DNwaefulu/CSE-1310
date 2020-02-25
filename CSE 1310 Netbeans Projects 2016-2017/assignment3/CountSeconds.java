import java.util.Scanner;

public class CountSeconds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please specify the number of seconds (between 1 and 86400): ");
        int s = in.nextInt();
        
        int h = (s/3600);
        int r = s % 3600;
        int m = (r/60);
        int r2 = (r%60);
        
        if(s > 86400)
        {
        System.out.printf("The number of seconds must be between 1 and 86400.\n");
        }
        
        else
        {
            System.out.printf("%d seconds correspond to %d hours, %d minutes, and %d seconds.\n", s, h, m, r2);
        }
    }
    
}
