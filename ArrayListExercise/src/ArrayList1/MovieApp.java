package ArrayList1;
import java.util.Scanner; 
import java.util.ArrayList;

public class MovieApp {
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are ten movies in this list.");
		String userContinue="y";
		while(userContinue.equalsIgnoreCase("y"))
		{
		System.out.println("What category are you interest in?");
		System.out.println("Pick a following category: Action, Comedy, Drama, Kids:");
		
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
 			
 			String cat=in.nextLine();
 			if(!cat.equalsIgnoreCase("drama")&&!cat.equalsIgnoreCase("action")&&!cat.equalsIgnoreCase("kids")&&!cat.equalsIgnoreCase("comedy"))
				{
 				System.out.println("We don't have that my baby. Enter a valid category.:");
 				cat=in.nextLine();
				}
 			for(int i=0; i<myList.size(); i++)
 			{ 				
  					if(myList.get(i).getCategory().equalsIgnoreCase(cat))
  	 				System.out.println(myList.get(i).getTitle());
 			}
 			
 				
 			System.out.println("Continue?(y/n):");
 			userContinue=in.nextLine();
		}
	}
	}
	


