
public class VirtualPet {
	boolean running() {
		return true;
	}

	int thirst = 40;
	int hunger = 40;
	int boredom = 40;
	int waste = 40;
	int tiredness = 40;

	String name;

	void tick() {
		hunger += 5;
		thirst += 5;
		boredom += 5;
		waste += 5;
		tiredness += 5;

	}

	void speak() {
		growl();
	}

	void growl() {
		System.out.println("Rawr!");
	}

	String feed() {
		hunger -= 25;
		thirst += 10;
		waste += 10;
		boredom -= 5;
		tiredness += 5;
		return "";
	}

	String giveWater() {
		hunger += 5;
		thirst -= 15;
		waste += 10;
		boredom += 0;
		tiredness += 0;
		return "";

	}

	String play() {
		hunger += 10;
		thirst += 10;
		waste += 0;
		boredom -= 15;
		tiredness += 10;
		return "";
	}

	String takeToBathroom() {
		hunger += 5;
		thirst += 5;
		waste -= 10;
		boredom -= 10;
		tiredness += 0;
		return "";
	}

	String putToBed() {
		hunger += 20;
		thirst += 15;
		waste += 10;
		boredom += 10;
		tiredness -= 25;
		return "";
	}

	boolean isHungry() {
		return hunger >= 50;
	}

	boolean isThirsty() {
		return thirst >= 50;
	}

	boolean isBored() {
		return boredom >= 50;
	}

	boolean needsBathroom() {
		return waste >= 50;
	}

	boolean isTired() {
		return tiredness >= 50;
	}

	boolean isDead() {
		return hunger >= 100 || thirst >= 100 || waste >= 100 || boredom >= 100 || tiredness >= 100;
	}

}
