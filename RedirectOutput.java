import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
 

public class RedirectOutput {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream Con = System.out;

		File file = new File("E://Sample.txt");
		FileOutputStream FOS = new FileOutputStream(file);
		PrintStream ps1 = new PrintStream(FOS);
		System.setOut(ps1);
		System.out.println("This will be shown in Sample.txt");
		

		System.setOut(Con);
		System.out.println("This will go to the console");
	}
}
