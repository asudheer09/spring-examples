import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numGuesses = 0;
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Enter a number between 1-10");
		
		int inputNumber=keyboard.nextInt();
		
		int randomNumber= new Random().nextInt(10)+1;
	
		
		while (inputNumber != randomNumber) {
            out.println();
            out.println("Try again...");
            out.print("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            System.out.println(randomNumber);
            numGuesses++;
        }
	}

}
