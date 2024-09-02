import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReader {

	//Attributes

	private String fileName;

	//Constructors
	public FileReader(){

	}

	public int countNumMovies()throws FileNotFoundException{
		// String filePath = ("/Users/yarah/onedrive/desktop/cs1/ECLAB/movies.csv");
		File movies = new File("movies-info.csv");
		Scanner movieScanner = new Scanner(movies);
		String line= movieScanner.nextLine();
		int count=0;
		while(movieScanner.hasNextLine()){
			count++;
			movieScanner.nextLine();
			System.out.println(movieScanner.next());
		}
		movieScanner = new Scanner(movies);
		return count;
	}

	//Methods

	//Getters/Setters
}
