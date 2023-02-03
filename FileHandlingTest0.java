import java.io.File;
import java.io.IOException;
public class FileHandlingTest0 {
	
	public static void main(String[] args) {
		File f = new File("f:\\myTestFile.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("file created successfully");
	}

}