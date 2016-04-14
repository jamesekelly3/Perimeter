package ArrayList1;

public class Movie 
{
private String Title; 
private String Category;


public Movie()
{
	
}
public Movie(String Title, String Category)
{
	setTitle(Title); 
	setCategory(Category); 
	
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}


}
