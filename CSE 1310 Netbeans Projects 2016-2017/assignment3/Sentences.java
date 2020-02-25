import java.util.Scanner;

public class Sentences {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Enter the first noun: ");
        String first_noun = in.next();
        System.out.printf("Enter the second noun: ");
        String second_noun = in.next();
        System.out.printf("Enter a verb: ");
        String verb = in.next();
        
        System.out.printf("The %s %s over the %s.\n", first_noun, verb,second_noun );
    }
    
}
