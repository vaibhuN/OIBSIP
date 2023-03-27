package vaishnaviProject;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber_Game {

	int theNumber;
	int max, i, N=5;
	
	Scanner scan=new Scanner(System.in);	

	public GuessingNumber_Game() {
		Random rmd= new Random();
		max=100;
		theNumber=Math.abs(rmd.nextInt())%(max+1);
	}
	public void play() {
		for(i=0; i<N; i++) {
			int move=scan.nextInt();
			if(move==theNumber) {
				System.out.println("WIN! WIN! \nYou got it bro!!");
				System.out.println("The number is: "+theNumber);
				break;
			}else if(move>theNumber && i!=N-1) {
				System.out.println("Number is Smaller than "+move);
			}else if(move<theNumber && i!=N-1) {
				System.out.println("Number is Bigger than "+move);
			}
		}
		
		if(i==N) {
			System.out.println("Sorry you lose the game");
			System.out.println("The number was: "+theNumber);
			System.out.println("Better luck next time :)");
		}
	}

	public static void main(String[] args) {
		GuessingNumber_Game game=new GuessingNumber_Game();
		System.out.println("Game is started!!");
		System.out.println("Let's see can you find out the number \nwhich is between 1 to 100..Good Luck!");
		System.out.println("Enter a number");
		game.play();
	}
}
