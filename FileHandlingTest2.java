import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingTest2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("f:\\myTestFile.txt",true);
		
		fw.write("I am the Earth \n");
		fw.write("I am the Forest Green \n");
		fw.write("I am the Four Winds Blowing \n");
		fw.write("I am the Earth \n");
		fw.flush();
		fw.close();
		System.out.println("File prepared successfully");
	}
	
}