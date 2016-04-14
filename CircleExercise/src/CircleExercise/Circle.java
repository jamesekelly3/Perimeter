import java.text.DecimalFormat;
import java.util.Scanner; 
public class Circle {
	static Scanner in = new Scanner(System.in);
	private float Radius;

	public float getRadius() 
	{
		return Radius;
	}

	public void setRadius(float radius) 
	{
		Radius = radius;
	}
	public Circle()
	{
		
	}
	public Circle(float radius)
	{
	 Radius= radius;
	}
	public static float readValidFloatNoExp(float x)
	{
		while(!in.hasNextFloat())
		{
			
			System.out.println("Enter a valid number:");
			in.nextLine(); 
			
		}
		
		x = in.nextFloat();
		return x;
	}
	public float getCircumerence()
	{
		return (float) (2*Math.PI*Radius);
	}
	public String getFormattedCircumference()
	{
		
	       return(formatNumber(getCircumerence()));
	}
	public float getArea()
	{
		return (float) (Radius*Math.PI*Radius);
	}
	public String getAreaFormatted()
	{
		
	       return(formatNumber(getArea()));
	}
	public String formatNumber(float x)
	{
		DecimalFormat df = new DecimalFormat("#,###,##0.000");
		return (df.format((x)));
	}
}
