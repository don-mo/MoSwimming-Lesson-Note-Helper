
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        // main menu loop
        // Add anilities
        // Remove abilities
        // View abilities
        // Load abilities
        // Save abilities
        // Quit
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to MoSwimming Instructor Progress Tracker Version 0.0.0!");
        String userInput = "";
        int commands = 0;
        System.out.println(
                "What option would you like? (Type the letters in parentheses, lowercase or uppercase is fine) ");
        System.out.println("(C)reate a new progress");
        System.out.println("(A)dd a new skill");
        System.out.println("(D)isplay skills");
        System.out.println("(De)lete a skill");
        System.out.println("(Ad)d a new category");
        System.out.println("(Q)uit");
        System.out.println();
        System.out.print("Answer here: ");
        userInput = console.next();

        while (!userInput.equalsIgnoreCase("quit")) {
            // if c
            // if a
            // if d
            // if de
            // if ad
            // else
            // } else if (!userInput.equalsIgnoreCase("q")) {
            // System.out.println("Unknown input: " + userInput);
            // }
            // if (!userInput.equalsIgnoreCase("q")) {
            // printTodos(toDoList);
            // }
            // }

            userInput = "quit";

        }

    }

}