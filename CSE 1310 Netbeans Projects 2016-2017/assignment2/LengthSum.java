import java.util.Scanner;

public class LengthSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please enter a string: ");
        String first = in.next();
        System.out.printf("Please enter a second string: ");
        String second = in.next();
        
        int first_name = first.length();
        int second_name = second.length();
        int sum = (first_name + second_name);
        
        System.out.printf("The first string has length %d.\n", first_name);
        System.out.printf("The second string has length %d.\n", second_name);
        System.out.printf("The sum of the two lengths is %d.\n", sum);
    }
    
}
