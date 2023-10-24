package Codsoft;
import java.util.Random;
import java.util.Scanner;

public class No_Game
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	    Random rand = new Random();
	    int minNo = 1;
	    int maxNo = 100;
	    int maxAtmt = 10;
	    System.out.println("Welcome to the Number Guessing Game!");
	    System.out.println("Guess a number between 1 and 100");
	    int randNo = rand.nextInt(maxNo - minNo + 1) + minNo;
	    int atmt = 0;
	    while (atmt < maxAtmt) {
	    	try
	    	{
	    		System.out.print("Enter your guess: ");
	    		int Guess = scanner.nextInt();
	    		atmt++;
	    		if (Guess < randNo)
	    		{
	    			System.out.println("Too low! Try again.");
	    		}
	    		else if (Guess > randNo)
	    		{
	    			System.out.println("Too high! Try again.");
	    		}
	    		else
	    		{
	    			System.out.println("Congratulations! You guessed the correct number " + randNo + " in " + atmt + " attempts.");
	    			break;
	    		}
	    	}
	    	catch (java.util.InputMismatchException e)
	    	{
	    		System.out.println("Invalid input. Please enter a valid number.");
	    		scanner.nextLine();
	    	}
	    }
	    if (atmt == maxAtmt)
	    {
	    	System.out.println("Sorry, you've used all your attempts. The correct number was " + randNo + ".");
	    }
	}	
}	