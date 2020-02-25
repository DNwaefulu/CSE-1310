import java.util.Scanner;

public class WordStart {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a word: ");
        String word = in.next();
        
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        
        String initial = word.substring(0, 1);
        
        if (vowels.indexOf(initial) != -1)
        {
            System.out.printf("%s starts with a vowel.\n", word);
        }
        else if (consonants.indexOf(initial) != -1)
        {
            System.out.printf("%s starts with a consonant.\n", word);
        }
        else
        {
            System.out.printf("%s starts with neither a vowel nor a consonant.\n", word);
        }
    }
    
}
