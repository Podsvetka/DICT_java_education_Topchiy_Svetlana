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
        System.out.println("Let me guess your age. \nEnter remainders of diving your age by 3, 5 and 7.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int userAge = ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);

        System.out.println("Your age is " + userAge + "; That's good time to start programming!");

    }
}


