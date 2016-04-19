import java.util.Scanner;

public class CountriesApp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Countries Application!");
		String userContinue = "y";
		while (userContinue.equalsIgnoreCase("y")) {
			System.out.println("\n1-See the list of countries\n2-Add a country\n3-Delete country\n4-Exit\n");
			System.out.print("Enter menu number:");
			System.out.println();
			int userChoice = getValidNumberInRange(1, 4);
			sc.nextLine();
			switch (userChoice) {
			case 1:
				CountriesTextFile.readFile();
				break;
			case 2:
				System.out.println("Enter new Country:");
				CountriesTextFile.writeToFile();
				System.out.println("This country has been added!");
				break;
			case 3:System.out.println("Enter country to be deleted:");
			String deletedCountry=sc.nextLine();
			CountriesTextFile.removeCountryFromList("LsCountries.txt", deletedCountry);
			System.out.println("This country has been deleted!");
			break;
			case 4:
				System.out.println("Bye homie ");
				userContinue.equalsIgnoreCase("n");
				break;
			}
			userContinue = "y";
		}
	}

	public static int readValidIntegerNoExp() {
		while (!sc.hasNextInt()) {
			System.out.println(
					"Not a valid integer.Please choose a " + "correct option.\n1-See the list of countries\n2-Add a "
							+ "country\n3-Exit\n\nEnter menu number:");
			sc.nextLine();

		}

		int x = sc.nextInt();
		return x;
	}

	public static int getValidNumberInRange(int min, int max) {
		int input = readValidIntegerNoExp();
		while (input < min || input > max) {
			System.out.println("Please put a number within range:");
			input = readValidIntegerNoExp();
		}
		return input;
	}
}
