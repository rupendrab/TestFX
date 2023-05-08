package finalexam;

public class StringTest {
	public static void main(String[] args) {
		String x = new String("Antigone");
		StringBuilder x1 = new StringBuilder("Antigone");
		x1.setCharAt(0, 'a');
		System.out.println(x1);
		x = "a" + x.substring(1);
		System.out.println(x);
	}

}
