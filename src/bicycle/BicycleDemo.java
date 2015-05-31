package bicycle;

public class BicycleDemo {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCandence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		bike2.changeCandence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCandence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}

}
