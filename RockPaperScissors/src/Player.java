
public abstract class Player 
{
private String Name; 
private String RoshamboValue; 

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public abstract String generateRoshambo();

public String getRoshamboValue() {
	return RoshamboValue;
}

public void setRoshamboValue(String roshamboValue) {
	RoshamboValue = roshamboValue;
}

}
