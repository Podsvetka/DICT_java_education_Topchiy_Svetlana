package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        String BotName = "Podsvetochka";
        int Data = 2022;
        System.out.println("Hello! My name is " + BotName);
        System.out.println("I was created in " + Data);
        System.out.println("Please, remind me your name.");
        System.out.print(">");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();

        System.out.println("What a great name you have, " + userName + "!");

    }
}

