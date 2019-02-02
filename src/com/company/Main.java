package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    // variables
        double temp = 99.8;
        double guess = 0;
        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("Enter a number between 92.0 and 104.0: ");
            guess = scanner.nextDouble();

            if(guess < 97.5) // guesses between 92 and 97.5
            {
                System.out.println("Your guess is on the low end.");
            }
            else if(guess < 99.5)
            {
                System.out.println("That guess is in the middle.");
            }
            else
            {
                System.out.println("You guessed near the high end of the range.");
            }

        }while(guess != temp);

        System.out.println("You guessed right! Good for you!");
    }
}
