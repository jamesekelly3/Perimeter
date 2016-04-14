import java.util.Scanner; 

public class myCircleApp {
	static Scanner in =new Scanner(System.in);

	public static void main(String[] args) {
		String userContinue="y";
		
		while(userContinue.equalsIgnoreCase("y"))
		{
			float newRadius=0; 
		
		Circle c= new Circle(newRadius);
		System.out.println("Welcome to the Circle Tester");
		System.out.print("Enter radius:");
		newRadius =in.nextFloat(); 
		in.nextLine();
		//newRadius = Circle.readValidFloatNoExp();
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
