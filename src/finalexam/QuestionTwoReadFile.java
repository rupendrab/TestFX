package finalexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionTwoReadFile {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("output.txt"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file could not be read");
		}
	}

}
