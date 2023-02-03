import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderTest0 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("f:\\TestFile.txt\\Rhyme.txt");
		BufferedReader br = new BufferedReader(fr);
		String line ;
		
		while((line = br.readLine()) !=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}