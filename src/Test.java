
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.text.Font;

public class Test {
	public static void main(String[] args) {
		IntegerProperty d1 = new SimpleIntegerProperty(1);
		IntegerProperty d2 = new SimpleIntegerProperty(2);
		d1.bindBidirectional(d2);
		System.out.println(d1);
		System.out.println(d2);
		d1.setValue(3);
		System.out.println(d1);
		System.out.println(d2);
		Font font = new Font("times", 34);
	}

}
