package finalexam;

public class Truck extends FourWheeler {

	@Override
	public float getSpeed() {
		return 0;
	}
	
	public float getSpeed(String direction) {
		return (float) 1.1;
	}
	
	public static void main(String[] args) {
		Truck truck = new Truck();
		System.out.println(truck.numberOfWheels());
		System.out.println(truck.getSpeed());
		System.out.println(truck.getSpeed("north"));
	}

}
