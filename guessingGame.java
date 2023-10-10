/*Ronald Noriega-Valdeolla
 * ITSE 2371
 * 9/11/2023
 In this exercise, Write a program that generates a random number (between 1 and 100)
 and asks the user to guess what the number is. If the user’s guess is higher than the random number,
 the program should display “Too high, try again.” If the user’s guess is lower than the random number,
 the program should display “Too low, try again.”
 The program should use a loop that repeats until the user correctly guesses the random number.. */

import java.util.Random;
import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		//Variables
		
		int max = 100; //The random number will be between the boundaries 1 to 100
		
		int min =1;
		
		int numb = random.nextInt(max)+min; //generator of random number 
		
		int guessnumb = 0; // The user will guess a number and it will get input in this location
		
		//Talk to the user
		
		System.out.println("Guess the Random Number (1-100): "); 
		
		//Store
		
		guessnumb = input.nextInt();
		
		//Calculation or logic
		
		while(guessnumb != numb) {
			
			if(guessnumb < numb){
				
				System.out.printf("Your number %d is to low. Try Again: ", guessnumb); 
				
				}else {System.out.printf("Your number %d is to high. Try Again: ", guessnumb);}
			
			
			
			
			guessnumb = input.nextInt();
		}
		
		//Display
		
		System.out.printf("Great Guess! You Guessed the Random Number!");
		
		input.close();
	}

}
