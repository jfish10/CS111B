class Bicycle {
	
	//properties : has
	public int cadence;
	public int gear;
	public int speed;
	
	
	//constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}
	
	//functionality : does
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	public void setGear(int newValue) {
		gear = newValue;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public static void main(String[] args) {
		Bicycle b = new Bicycle(12,14,10); //instantiation, object created in memory
		b.speedUp(12);
		System.out.println(b.speed);
	}
}