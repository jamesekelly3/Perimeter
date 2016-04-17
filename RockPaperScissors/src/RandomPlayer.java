
public class RandomPlayer extends Player {

	@Override
	public String generateRoshambo() 
	{
		String RoshamboValue="";
		int random = (int )(Math. random() * 3 + 1);
		switch(random)
		{
		case 1: RoshamboValue= "rock";
		break;
		case 2: RoshamboValue= "paper";
		break; 
		case 3: RoshamboValue="scissors";
				break;
		
		}
		return RoshamboValue;
	}

}
