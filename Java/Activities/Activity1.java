package Activities;

public class Activity1 {

	public static void main(String[] args) {
		Car Porsche = new Car();
		
		Porsche.make = 2014;
		Porsche.color = "Black";
		Porsche.transmission= "Manual";
		
		
		Porsche.displayCharacteristics();
		Porsche.accelerate();
		Porsche.brake();
	}

}
