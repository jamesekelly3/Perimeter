package ArrayList1;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Arrays;

public class MovieApp2 {
	public static int readValidIntegerNoExp()
	{
		while(!in.hasNextInt())
		{
			System.out.println("Not a valid number. Please enter valid enry.");
			in.nextLine(); 
			
		}
		
		int x = in.nextInt();
		return x;
	}
	public static int getValidNumberInRange(int min, int max)
	{
		int input= readValidIntegerNoExp(); 
				while(input < min || input> max)
				{
					System.out.println("Please put a number within range");
					input =readValidIntegerNoExp();
				}
				return input; 
	}
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are ten movies in this list.");
		String userContinue="y";
		while(userContinue.equalsIgnoreCase("y"))
		{
		System.out.println("What category are you interest in?");
		System.out.println("The following are the categories: \n1-Action \n2-Comedy \n3-Drama \n4-Kids\nPlease enter the number ofthe category you would like to view:");
	
		ArrayList<Movie> myList = new ArrayList<>();
		  
		String[] title={"Roots", "Batman vs Superman", "Devil Wears Prada", "The Godfather", "The Color Purple", "White Chicks", "Titanic", "Finding Nemo", 
		"Mean Girls", "Men In Black"};
 		String[] categories={"Drama", "Action", "Comedy", "Drama", "Drama", "Comedy", "Drama", "Kids", "Comedy","Action"};

 			for (int i = 0; i < 10; i++) 
 			{
 				myList.add(new Movie());
 				myList.get(i).setTitle(title[i]);
 	            myList.get(i).setCategory(categories[i]);
 	            
 			}
 			
 			int cat=getValidNumberInRange(1,4);
 			 
 			String catName; 
 			switch(cat)
 			{
 				case 1:catName="Action"; 
 				break;
 				case 2:catName="Comedy";
 				break;
 				case 3:catName="Drama";
 				break;
 				case 4:catName="Kids"; 
 				break;
 				default:catName="Not valid";
 				System.out.println("Entry not valid");
 				break;
 				
 			}
 			if(catName.equalsIgnoreCase("Not a valid entry"))
				{
 				System.out.println("We don't have that my baby. Enter a valid category.:");
 				cat=in.nextInt();
 				in.nextLine();
				}
 			for(int i=0; i<myList.size(); i++)
 			{ 				
  					if(myList.get(i).getCategory().equalsIgnoreCase(catName))
  	 				//String sort=Arrays.sort(myList.get(i).getTitle());
  					System.out.println(myList.get(i).getTitle());
 			}
 			
 			in.nextLine();	
 			System.out.println("Continue?(y/n):");
 			userContinue=in.nextLine();
		}
		in.close();
	}
	

	}
	