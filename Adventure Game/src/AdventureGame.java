import java.util.*; 
public class AdventureGame {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		System.out.println(" What is your name? (enter your name)");
		String userName = in.nextLine(); 
		System.out.println("Would you like to play a game");
		String userAnswer = in.nextLine(); 
		if(userAnswer.equalsIgnoreCase("n"))	
		{
			System.out.println("See you on the next adventure");
		}
		else
		{
			System.out.println("Excellent! You are walking across a field "
					+ "and you encounter a fire-breathing dragon! "
					+ "What do you do? (enter face the beast or run away):"); 
					//How do you write quotes in a String
			String userChoice = in.nextLine();
			
		if (userChoice.equalsIgnoreCase("run away"))
		{
			System.out.println(" You are too scary for me");
		}
		else
		{
			System.out.println(" You approach the dragon. You see that "
					+ "he has _ heads.(enter 1, 2, or 3)");
			String numberHeads = in.nextLine(); 
			System.out.println(" No one has ever faced a "+ numberHeads + 
					"-headed dragon before! Choose your weapon. (enter slingshot"
					+ " or sword or bow and arrow)");
			String weaponChoice= in.nextLine(); 
			System.out.println(" Armed with your "+ weaponChoice+ " you approach"
					+ " the dragon. You can feel its fiery breathe as you get"
					+ " closer. It stares at you with its __ eyes. (enter red or blue)" );
			String userEyes = in.nextLine(); 
			System.out.println(" Oh thank goodness! " + userEyes+ "-eyed dragons are "
					+ "friendly. You pet it and become friends. You name the dragon ___."
					+ "(enter a name):");
			String dragonName= in.nextLine(); 
			System.out.println(userName + " and "+ dragonName + " live happily ever after. ");
		
		}
					
			
			
		}
		

	}

}
