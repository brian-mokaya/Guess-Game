package  GuessingGame;

import  java.util.Scanner;

public class GuessingGame {
    private static final int MaxAttempts = 5;

    public void startGame(){
    //generate a random number between 1 and 100
    int randomNumber = (int)(Math.random() * 100) + 1;

    int attempts = 0, totalRounds = 0, totalScore = 0;
    boolean GuessedCorrect = false;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welome to the Guess Game!");
    System.out.println("I have chosen a number between 1 and 100, try to guess it.");

    //loop until correct guess
    while(GuessedCorrect = true && attempts < MaxAttempts){
        System.out.println("Enter your guess: ");
        int guess = scanner.nextInt();
        attempts++;

        //compare the guess to the random number
        if (guess == randomNumber) {
            System.out.println("Congratulations! You guessed correctly in " + attempts + " attempts!");
            GuessedCorrect = true;
            totalScore += MaxAttempts - attempts + 1;
            attempts++;
        }
        else if (guess<randomNumber){
            System.out.println("The number is high than your guess. Try again.");
        }
        else {
            System.out.println("The number is lower than your guess. Try again.");
        }
    }
    if (GuessedCorrect = true){
        System.out.println("You have used all your attempts. The correct number was " + randomNumber);
    }
    totalRounds++;
    System.out.println("Your total score is " + totalScore + " , have played " + totalRounds + " rounds.");
    System.out.println("Thanks for playing the Guess Game! Do you want to play again? (yes/no)");
    String playAgain = scanner.next();
    if (playAgain.equalsIgnoreCase("yes")){
        startGame();
    }
    else {
        System.out.println("Goodbye!");
    }
    scanner.close();
    }
}