import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a word: ");
        String word = in.next();
        
        for(int i = 0; i < word.length(); i++)
        {
            char vowel = word.charAt(i);
            if ((vowel != 'A' ) && (vowel != 'E' ) && (vowel != 'I') && (vowel != 'O' )
                    && (vowel != 'U' ) && (vowel != 'a' ) && (vowel != 'e' ) && (vowel != 'i' )
                    && (vowel != 'o' ) && (vowel != 'u' ))
            {
                System.out.printf("%c", word.charAt(i));
            }
            
        }
        System.out.printf("\nExiting...\n");
    }
}
