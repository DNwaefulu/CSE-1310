import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please enter an integer N: ");
        int N = in.nextInt();
        System.out.printf("Please enter a word with at least %d and at most 20 letters: ", N);
        String first = in.next();
        System.out.printf("Please enter a second word with at least %d and at most 20 letters: ", N);
        String second = in.next();
        System.out.printf("Please enter a third word with at least %d and at most 20 letters: ", N);
        String third = in.next();
        
        String f = first.substring(0, N);
        String s = second.substring(0, N);
        String t = third.substring(0, N);
        
        System.out.printf("%20s starts with %s\n", first, f);
        System.out.printf("%20s starts with %s\n", second, s);
        System.out.printf("%20s starts with %s\n", third, t);
    }
    
}
