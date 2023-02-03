import java.io.File;
public class FileHandlingTest1 {
	public static void main(String[] args) {
		File f = new File("f:\\myTestFile.txt");
		
		if (f.exists()) {
			System.out.println("Printing File Details");
			System.out.println("---------------------");
			
			System.out.println("File Name :" + f.getName());
			System.out.println("File Size :" + f.length());
			System.out.println("File Path :" + f.getAbsolutePath());
			System.out.println("Is File readable ?" + f.canRead());
			System.out.println("Is File writable ?" + f.canWrite());
			System.out.println("---------------------");
		}
		File f1 = new File("f:\\TestFile.txt");
		f1.mkdir();
	}

}