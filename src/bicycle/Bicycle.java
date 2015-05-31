package bicycle;

public class Bicycle {

	int cadence = 0;
	int speed = 0;
	int gear = 0;
	
	void changeCandence(int newValue){
		cadence = newValue;
	}
	void changeGear(int newValue){
		gear = newValue;
	}
	void speedUp(int incremant){
		speed = speed+incremant;
	}
	void applyBreak(int decrement){
		speed = speed - decrement;
	}
	void printStates(){
		System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+gear);
	}
}
