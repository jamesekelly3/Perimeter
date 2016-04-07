import java.util.*;

public class PerimeterArea 
{
	public static void main(String[] args) 
	{
		getDimensions();
	}	

	public static void getDimensions() {
		// Need Scanner for input
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room " + "Detail Generator!");
		System.out.println("Enter Length:");
		// User inputs length
		String userLength = in.nextLine();
		// Change String to number
		double length = Double.parseDouble(userLength);
		System.out.println("Enter Width:");
		// User inputs width
		String userWidth = in.nextLine();
		// Change String to number
		double width = Double.parseDouble(userWidth);
		System.out.println("Enter Height:");
		// User inputs heights
		String userHeight = in.nextLine();
		double height = Double.parseDouble(userHeight);
		// System prints out dimensions of room
		System.out.println("Area: " + (width * length));
		System.out.println("Perimeter: " + (2 * width + 2 * length));
		System.out.println("Volume " + height * width * length);

		System.out.println("Continue? (y/n):");
		String userAnswer = in.nextLine();
		// System stops at NO (n) & Continues otherwise
		if (userAnswer.equals("n")) {
			System.out.println("You're done");
		} else {
			getDimensions();

		}
	}
	}


