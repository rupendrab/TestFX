package finalexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class QuestionOneWriteFileException {
	
	public static void main(String[] args) {
		try
		{
			
			PrintWriter p = new PrintWriter(new File("outputs/output.txt"));
			p.println("Hello World");
			p.println("here are the numbers 1 through 10");
			for (int i=1; i<=10; i++) {
				p.println(i);
			}
			p.close();
		}
		catch (FileNotFoundException fe) {
			System.out.println(fe.toString());
		}
	}

}
