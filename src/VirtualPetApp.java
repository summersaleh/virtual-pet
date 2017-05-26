import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet bear = new VirtualPet();

		writeLine("Welcome to the Yosemite National Park virtual pet store" + "\n"
				+ "You get to pick your very own bear to bring home and take care of! " + "\n");

		writeLine("What would you like to name your new bear?");

		bear.name = input.next();
		checkForQuit(bear.name);

		writeLine("\n"+"Hi " + bear.name + ", let's play!");
		writeLine("You can type \"needs\" at anytime to check " + bear.name + "'s stats."+ "\n");
		
		do {

			String stats = ("Hunger:" + bear.hunger + "\n" + "Thirst:" + bear.thirst + "\n" + "Boredom:" + bear.boredom
					+ "\n" + "Bathroom need:" + bear.waste + "\n" + "Tiredness:" + bear.tiredness + "\n");

			if (bear.isHungry()) {
				writeLine("Feed me!" + "\n");
			}
			if (bear.isThirsty()) {
				writeLine("I'm thirsty!" + "\n");
			}
			if (bear.isBored()) {
				writeLine("Play with me!" + "\n");
			}
			if (bear.needsBathroom()) {
				writeLine("I need to go to the little bear's room!" + "\n");
			}
			if (bear.isTired()) {
				writeLine("I'm sleepy!" + "\n");
			}
			if (bear.isDead()) {
				writeLine("How could you kill " + bear.name);
				writeLine("Thanks for playing!");
				System.exit(0);
			}
			if (bear.hunger < 0) {
				bear.hunger = 0;
			}
			if (bear.thirst < 0) {
				bear.thirst = 0;
			}
			if (bear.boredom < 0) {
				bear.boredom = 0;
			}
			if (bear.waste < 0) {
				bear.waste = 0;
			}
			if (bear.tiredness < 0) {
				bear.tiredness = 0;
			}
			if (bear.hunger > 80) {
				bear.feed();
				writeLine(bear.name + " was hungry so he fed himself!");
			}

			String menu = ("What would you like to do with " + bear.name + "\n" + "1)Feed" + "\n" + "2)Give Water"
					+ "\n" + "3)Play" + "\n" + "4)Take to Bathroom" + "\n" + "5)Put to sleep" + "\n" + "6)Do nothing");

			writeLine(menu);

			String choice = input.next();
			checkForQuit(choice);

			if (choice.toLowerCase().equals("stats")) {
				writeLine(stats);
			} else {

				switch (choice) {

				case "1":
					choice = bear.feed();
					writeLine("Yummm, thank you for feeding me!");
					break;

				case "2":
					choice = bear.giveWater();
					writeLine("Slurrp! Ahhh thanks, I was thirsty!");
					break;

				case "3":
					choice = bear.play();
					writeLine("I was getting bored, thank you for playing with me!");
					break;

				case "4":
					choice = bear.putToBed();
					writeLine("Zzzzzzzzzzzzz");
					break;

				case "5":
					choice = bear.takeToBathroom();
					writeLine("Ahhhh sweet relief");
					break;

				case "6":
					writeLine("I guess I'll just hang out with my lonesome");
					break;
				}
			}

			writeLine("We have advanced a day");
			bear.tick();

		} while (bear.running());

		input.close();
	}

	public static void writeLine(String message) {
		System.out.println(message);
	}

	public static void writeLineInt(int message) {
		System.out.println(message);
	}

	public static void checkForQuit(String input) {
		if (input.equalsIgnoreCase("quit")) {
			System.out.println("Goodbye! Thanks for playing!");
			System.exit(0);

		}
	}
}
