import java.util.Scanner; 
public class HumanPlayer extends Player {

	@Override
	public String generateRoshambo() 
	{
		String RoshamboValue="";
		System.out.println("Rock,paper,or scissors(R/P/S):");
		String R="rock";
		String P="paper";
		String S="scissors";
		Scanner in= new Scanner(System.in);
		String value=in.nextLine();
		value.toUpperCase();
		switch(value)
		{
		case "R": RoshamboValue="rock"; 
		break; 
		case "P": RoshamboValue="paper";
		break; 
		case "S": RoshamboValue="scissors";
		break; 
		default: System.out.println("What did you pick?");
		break;
		}
		return RoshamboValue;
	}

}
