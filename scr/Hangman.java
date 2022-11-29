package scr;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {
    public static void main(String[] args){
        ArrayList<String> wordsArr = new ArrayList<>();
        wordsArr.add("java");
        wordsArr.add("kotlin");
        wordsArr.add("python");
        wordsArr.add("javascript");
        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(wordsArr.size());
        String word = wordsArr.get(randomInt);
        StringBuilder hiddenWord = new StringBuilder(word.substring(0, 2));
        for (int i = 0; i < word.length() - 2; i++){
            hiddenWord.append('-');
        }
        System.out.println("HANGMAN");
        System.out.println("Guess the word:>" + hiddenWord );

        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();

        if(answer.equals(word)){
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
