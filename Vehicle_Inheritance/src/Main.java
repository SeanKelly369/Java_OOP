
public class Main {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("manual", 5, 40, 4);
		Car corolla = new Toyota_Corolla("automatic", 6, 50);
		
		vehicle.increaseSpeed(5);
		vehicle.decreaseSpeed(8);
		vehicle.getSteering();
		corolla.setCarColour("red");
		corolla.getCarColour();
		
		
		// Challenge
		// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
		// Finally, create another class, a specific type of Car that inherits from the Car class.
		// You should be able to handle steering, changing gears, and moving (speed in other words).
		// You will want to decide where to put the appropriate state and behaviours (fields and methods).
		// As mentioned above, changing gears, increasing/decreasing speed should be included.
		// For your specific type of vehicle you will want to add something specific for that type of car.
		
	}

}
