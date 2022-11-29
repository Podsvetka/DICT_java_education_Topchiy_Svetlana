package scr;
import java.util.Random;
import java.util.Scanner;


public class Hangman {
    public static void main(String[] args){
        String[] words = {"java", "python", "javascript", "kotlin"};
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(words.length);
        String word = words[randomInt];
        System.out.println("HANGMAN "+ "\n Guess the word:>");
        Scanner user_input = new Scanner(System.in);
        String answer = user_input.nextLine();

        if (answer.equals(word) ) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
