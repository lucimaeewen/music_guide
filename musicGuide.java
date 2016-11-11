import java.util.Scanner;
import java.io.*;
public class musicGuide {
	
	public static void scales(Scanner input, String mode, String key){
		//print the scale of given mode and key
		
		System.out.println(mode+" | "+key);
	}

	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("What category would you like info about?");
		System.out.println("\tScales <mode>,<key>"+
						 "\n\tChords <mode>,<key>"+
						 "\n\tProgression Pattern for Scales <mode>,<key>"+
						 "\n\tFingerings <key>");
		String category = userInput.nextLine();
		category = category.toLowerCase();
		String[] input = category.split("\\s+");
		String mode = input[1];
		String key = input[2];
		scales(userInput,mode,key);
	}
}