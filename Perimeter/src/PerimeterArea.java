import java.util.Scanner;

public class PerimeterArea 
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		String userContinue = "y";
		while (userContinue.equalsIgnoreCase("y")) 
		{
			System.out.println();
			System.out.print("Enter Length:");
			double length = in.nextDouble();
			in.nextLine();
			System.out.print("Enter Width:");
			double width = in.nextDouble();
			in.nextLine();
			System.out.print("Enter Height:");
			double height = in.nextDouble();
			in.nextLine();
			getDimensions(length, width, height);
			userContinue = in.nextLine();
			
		}
		in.close();
	}

	public static void getDimensions(double length, double width, double height) {
		double area = width * length;
		double perimeter = 2 * length + 2 * width;
		double volume= area*height; 
		System.out.print("Area:" + area + "\n" + "Perimeter:" + perimeter + 
				"\nVolume:"+ volume+"\n\n" + "Continue?(y/n):");
	}
}
