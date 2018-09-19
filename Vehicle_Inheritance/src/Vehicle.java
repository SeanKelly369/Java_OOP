
public class Vehicle {
	private String steering;
	private int gears;
	private int movingSpeed;
	private int numSeats;
	
	public Vehicle(String steering, int gears, int movingSpeed, int numSeats) {
		super();
		this.steering = steering;
		this.gears = gears;
		this.movingSpeed = movingSpeed;
	}

	public String getSteering() {
		System.out.println("The steering type is " + steering);
		return steering;
	}

	public int getGears() {
		return gears;
	}

	public int getMovingSpeed() {
		return movingSpeed;
	}

	public void increaseSpeed(int speedChange) {
		this.movingSpeed = movingSpeed + speedChange;
		System.out.println("The Vehicle speed has been increased to " + movingSpeed + "kpm");
		
	}

	public void decreaseSpeed(int speedChange) {
		this.movingSpeed = movingSpeed - speedChange;
		System.out.println("The Vehicle speed has been decreased to " + movingSpeed + "kpm");
		
	}

	public int getNumSeats() {
		return numSeats;
	}

	
	
	
}
