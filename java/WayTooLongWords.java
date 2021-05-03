// package test;
import java.util.Scanner;

public class csWayTooLongWords {
    public static void main(String[] args) {
        // ----- Scanner object
        Scanner sc  = new Scanner(System.in);

        // ----- Number of words
        int noOfWords   = sc.nextInt();
        String[] words  = new String[noOfWords+1];
        
        // ----- takes the words from the user
        for (int i = 0; i <= noOfWords; i++) {
            words[i]    = sc.nextLine();
        }

        for (String word : words) {
            int wordLength  = word.length();
            if (wordLength <= 10) {
                System.out.println(word);
            } else {
                int restLength  = wordLength - 2;
                System.out.println(word.charAt(0) + Integer.toString(restLength) + word.charAt(wordLength-1));
            }
        }

        // ----- Destory the object
        sc.close();

    }    
}
