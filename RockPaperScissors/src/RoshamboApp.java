import java.util.ArrayList;
import java.util.Scanner;
public class RoshamboApp 
{
static Scanner in= new Scanner(System.in);
	public static void main(String[] args) 
	{
		ArrayList<Player> playerPlayer= new ArrayList<>();
		Player p1=new RockPlayer();
		Player p2=new RandomPlayer();
		Player p3=new HumanPlayer();
		p1.setName("TheJets");
		p2.setName("TheSharks");
		p3.setName("James");
		String j="TheJets";
		String s="TheSharks";
		String result="";
		String humanResult="";
		String computerName="";
		System.out.print("Welcome to Rock, Paper,Scossors!\n\nEnter your name:");
		String name=in.nextLine();
		System.out.print("Would you like to play against TheJets or TheSharks(j/s)?:");
		String userPick=in.nextLine(); 
		userPick.equalsIgnoreCase(userPick);
		userPick.toLowerCase();
		switch(userPick)
		{
		case "j":result=p1.generateRoshambo();
		computerName=p1.getName();
		break;
		case "s":result=p2.generateRoshambo();
		computerName=p2.getName();
		default: System.out.println("That's not a team homie");
		break;
		}
		humanResult=p3.generateRoshambo();
		System.out.println(name+":"+ humanResult);
		System.out.println(computerName+":"+result);
		if(humanResult.equals(result))
			System.out.println("Draw!");
		else if(humanResult.equals("rock")&&result.equals("scissors"))
			System.out.println(p3.getName()+" Wins!");
		else if(humanResult.equals("rock")&&result.equals("paper"))
			System.out.println(userPick+" Wins!" );
		else if(humanResult.equals("scissors")&&result.equals("paper"))
			System.out.println(p3.getName()+" Wins!");
		else if(humanResult.equals("scissors")&&result.equals("rock"))
			System.out.println(userPick+" Wins!");
		else
			System.out.println("Draw!");
		

	}

}
