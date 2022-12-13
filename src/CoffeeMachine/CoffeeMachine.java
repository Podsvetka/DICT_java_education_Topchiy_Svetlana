package src.CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {

        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            System.out.println("Write how many cups of coffee you will need:");
            System.out.print(">");
            int num = in.nextInt();
            System.out.printf("For "+ num + " cups of coffee you will need:\n");
            int numWater = num*200;
            System.out.printf(numWater + " ml of water\n");
            int numMilk = num*50;
            System.out.printf(numMilk + " ml of milk\n");
            int numBeans = num*15;
            System.out.printf(numBeans + " g of coffee beans\n");
        }
    }
