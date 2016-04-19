import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		writeToFile();
	}
	
	
	public static void readFile() {
		Path countriesLsPath = Paths.get("LsCountries.txt");
		File countriesLsFile = countriesLsPath.toFile();
		try {
		FileReader r = new FileReader(countriesLsFile);
		BufferedReader in = new BufferedReader( r);
		String line = in.readLine();
		while (line !=null)
		{
		System.out.println(line);
		line = in.readLine();
		}
		in.close();
		}
		catch (IOException e)
		{
		System.out.println(e);
		}
	}
	public static void writeToFile() {
		Path lsCountriesPath = Paths.get("LsCountries.txt");
		File lsCountriesFile = lsCountriesPath.toFile();
		
		try 
		{
			FileWriter fw = new FileWriter(lsCountriesFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			//String text="India\nThe United States\nChina\nRwanda";
			String newCountry=sc.nextLine();
			out.println(newCountry);
			
			
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static void removeCountryFromList(String file, String lineToRemove) {
		 Path lsCountriesPath = Paths.get("LsCountries.txt");
			File lsCountriesFile = lsCountriesPath.toFile();
		    try {
		 
//		      File countriesLsFile = new File(file);
//		      
//		      if (!inFile.isFile()) {
//		        System.out.println("Parameter is not an existing file");
//		        return;
//		      }
		       
		      //Construct the new file that will later be renamed to the original filename. 
		      File tempFile = new File(lsCountriesFile.getAbsolutePath() + ".tmp");
		      
		      BufferedReader br = new BufferedReader(new FileReader(lsCountriesFile));
		      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		      
		      String line = null;
		 
		      //Read from the original file and write to the new 
		      //unless content matches data to be removed.
		      while ((line = br.readLine()) != null) {
		        
		        if (!line.trim().equals(lineToRemove)) {
		 
		          pw.println(line);
		          pw.flush();
		        }
		      }
		      pw.close();
		      br.close();
		      
		      //Delete the original file
		      if (!lsCountriesFile.delete()) {
		        System.out.println("Could not delete file");
		        return;
		      } 
		      
		      //Rename the new file to the filename the original file had.
		      if (!tempFile.renameTo(lsCountriesFile))
		        System.out.println("Could not rename file");
		      
		    }
		    catch (FileNotFoundException ex) {
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      ex.printStackTrace();
		    }
		  }
}
