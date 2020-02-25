import java.util.Scanner;

public class MarchSundays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("When is the first Sunday of March? ");
        int date = in.nextInt();
        
        if (date > 0 && date < 8)
        {
            System.out.println("This March, Sundays fall on: ");
            for (int i = date; i <= 31; i+= 7)
            {
                System.out.printf("March %d\n", i);
            }
        }
        else
        {
            System.out.printf("invalid entry\n");
        }
    }
    
}
