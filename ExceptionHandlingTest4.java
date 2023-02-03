import java.io.IOException;
import java.io.File;

public class ExceptionHandlingTest4 {
    public static void main(String[] args) throws IOException{
        File f = new File("f:\\abc.txt");
        f.createNewFile();        
    }
}