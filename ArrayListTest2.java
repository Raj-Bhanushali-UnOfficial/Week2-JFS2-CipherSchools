import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            ArrayList myl = new ArrayList();
            for (int i = 1; i <= 5; i++) {
            	String item = sc.next();
            	if (myl.contains(item)) {
            		continue;
            	}
            	myl.add(item);
            }
            System.out.println(myl);
        }
	}
}