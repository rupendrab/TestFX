package finalexam;

import javafx.scene.control.Button;

public class Car extends FourWheeler {

	@Override
	public float getSpeed() {
		return 0;
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.numberOfWheels());
		Button myButton = new Button("Test");
		myButton.setText("Test");
	}


}
