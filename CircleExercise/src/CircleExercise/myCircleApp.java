import java.util.Scanner; 

public class myCircleApp {
	public static float readValidFloatNoExp()
	{
		while(!in.hasNextFloat())
		{
			System.out.println("C'mon now, you know that's not a float"
					+ ". Enter a real float:");
			in.nextLine(); 
			
		}
		
		float x = in.nextFloat();
		in.nextLine();
		return x;
	}
	static Scanner in =new Scanner(System.in);

	public static void main(String[] args) {
		String userContinue="y";
		
		while(userContinue.equalsIgnoreCase("y"))
		{
			float newRadius=0; 
		
		Circle c= new Circle(newRadius);
		System.out.println("Welcome to the Circle Tester");
		System.out.print("Enter radius:");
		newRadius = readValidFloatNoExp();
		c.setRadius(newRadius);
		String circumference=c.getFormattedCircumference();
		String area=c.getAreaFormatted();
		
		
		System.out.println("Cirumference:"+ circumference );
		System.out.println("Area:" + area);
		System.out.println("Continue?(y/n):");
		userContinue=in.nextLine();
		}
		if(userContinue!="y")
			System.out.println("Goodbye");
	}
	
}

