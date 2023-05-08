package finalexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class QuestionOneWriteFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter p = new PrintWriter(new File("output.txt"));
		p.println("Hello World");
		p.println("here are the numbers 1 through 10");
		for (int i=1; i<=10; i++) {
			p.println(i);
		}
		p.close();
	}

}
