package ly.generalassemb;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the magic 8 ball! Ask me yes/no questions.");

        // Declare a variable to control whether the loop continues.
        boolean playAgain = false;

        // Execute the loop at least once in order to play the game.
        // If the user says yes in shakeAgain() then repeat the loop.
        do {
            countdown();
            shakeTheBall();

            // Update playAgain based on the user's input.
            playAgain = shakeAgain();

        } while (playAgain);

        System.out.println("Goodbye");
    }

    public static int getRandomNumber() {
        // Use Math.random() to get a double between 0.0 and 1.0, scale it by 8, then round to nearest whole number.
        return (int) Math.round(Math.random() * 8);
    }

    public static void shakeTheBall() {
        int responseNumber = getRandomNumber();

        String responseText;

        // Pick a response based on the random number.
        switch (responseNumber) {
            case 0:
                responseText = "It is certain";
                break;
            case 1:
                responseText = "Without a doubt";
                break;
            case 2:
                responseText = "Outlook good";
                break;
            case 3:
                responseText = "Reply hazy try again";
                break;
            case 4:
                responseText = "Better not tell you now";
                break;
            case 5:
                responseText = "Most likely";
                break;
            case 6:
                responseText = "My reply is no";
                break;
            case 7:
                responseText = "Outlook not so good";
                break;
            case 8:
                responseText = "Very doubtful";
                break;
            default:
                responseText = "Ask again later";
        }

        System.out.println(responseText);
    }

    public static boolean shakeAgain() {
        System.out.println("Would you like to play again? (yes or no)");

        // Get the user's input.
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Check if the user's input starts with a 'y'. Ignore leading spaces (if any) and ignore case.
        // Also make sure the input has at least 1 character before we call charAt(0).
        if (userInput.length() > 0 && userInput.trim().toLowerCase().charAt(0) == 'y') {
            return true;
        }
        else {
            return false;
        }

        // Optionally, this one line could replace the above if/else statement:
        //return userInput.length() > 0 && userInput.charAt(0) == 'y';
    }

    public static void countdown() {
        System.out.println("Think about your question...");

        // Thread.sleep() pauses execution for the specified number of milliseconds.
        // The sleep() method might throw an InterruptedException, so we have to handle that with try/catch.
        // Don't worry too much about this now; we'll cover try/catch in a later lesson.
        try {
            Thread.sleep(500);
            System.out.println("5...");
            Thread.sleep(500);
            System.out.println("4...");
            Thread.sleep(500);
            System.out.println("3...");
            Thread.sleep(500);
            System.out.println("2...");
            Thread.sleep(500);
            System.out.println("1...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
