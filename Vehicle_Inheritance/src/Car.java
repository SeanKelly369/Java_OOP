
public class Car extends Vehicle {
	
	protected String carColour;
	protected int numWheels;

	public Car(String steering, int gears, int movingSpeed) {
		super(steering, gears, movingSpeed, movingSpeed);
	}
	

	public String getCarColour() {
		System.out.println("The car's colour is " + carColour);
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}


	public int getNumWheels() {
		return numWheels;
	}


	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

}
