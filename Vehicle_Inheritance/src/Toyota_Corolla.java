
public class Toyota_Corolla extends Car {
	
	private String vehicleType;
	private int age;

	public Toyota_Corolla(String steering, int gears, int movingSpeed) {
		super(steering, gears, movingSpeed);
	}


	public String getVehicleType() {
		return vehicleType;
	}

	public int getAge() {
		System.out.println("This Toyota Corolla's age is " + age);
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	

}
