import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ch15FileDemo {

	public static void main(String[] args) {
		System.out.println("Hello, this is a test");
		String dirString = "c:/test/test2";
		String dirString2 = "products.txt";
		Path dirPath = Paths.get(dirString);
		Path dirPath2 = Paths.get(dirString2);
		if (Files.notExists(dirPath)) {
			try {
				Files.createDirectories(dirPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("dir already exists");
		} if (Files.notExists(dirPath2)) {
			System.out.println(dirPath2+" created.");
			try {
				Files.createFile(dirPath2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				System.out.println("goodbye");
	}
}
