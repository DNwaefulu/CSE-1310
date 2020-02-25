import java.util.Scanner;

public class FourCapitalizations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Please enter a string: ");
        String g = in.nextLine();
        
        String f = g.substring(0, 1);
        int length = g.length();
        String s = g.substring(1, length); 
        
        String i = f.toUpperCase();
        String first = i + s;
        
        
        System.out.printf("1st version: %s\n", g);
        System.out.printf("2nd version: %s\n", g.toUpperCase());
        System.out.printf("3rd version: %s\n", g.toLowerCase());
        System.out.printf("4th version: %s\n", first);
    }
    
}
