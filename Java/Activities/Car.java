package Activities;

public class Car {

	 
		// TODO Auto-generated method stub
		 String color;
		String transmission;
		 int make;
		 int tyres;
		int doors;
		
		  Car() {
			tyres= 4;
			doors = 4;
			
		}
		  
		  
			  public void displayCharacteristics() {
				  System.out.println("Color of car: "+ color);
				  System.out.println("Speed of car: "+ transmission);
				  System.out.println("make of car: "+ make);
				  System.out.println("No of Tyres and doors of car: "+ tyres+ " and "+ doors);
				    
			  }
			  public void accelerate() {
				  System.out.println("The car is moving forward");
			  }
			  
			  public void brake() {
				  System.out.println("Car has stopped");
			  }
		  
		

	

}
