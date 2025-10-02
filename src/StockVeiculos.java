import java.util.ArrayList;
import java.util.Scanner;

class StockVeiculos {
	private ArrayList<Car> cars = new ArrayList<>();

	public void registerCars() {
		Scanner input = new Scanner(System.in);
		char choice;

		do {
			System.out.println("Car Brand?");
			String brand = input.nextLine();

			System.out.println("Car Model?");
			String model = input.nextLine();

			System.out.println("Car Color?");
			String color = input.nextLine();

			System.out.println("How much CC?");
			double cc = input.nextDouble();

			System.out.println("Is it automatic or manual (a/m)?");
			char gear = input.next().charAt(0);
			boolean isAutomatic = (gear == 'a' || gear == 'A');

			System.out.println("Car ID?");
			int id = input.nextInt();

			System.out.println("Car Year?");
			int year = input.nextInt();
			input.nextLine(); // Clear buffer

			cars.add(new Car(id, year, cc, brand, model, color, isAutomatic));

			System.out.println("\nDo you wish to continue? (y/n)");
			choice = input.next().charAt(0);
			input.nextLine();
		} while ((choice == 'y' || choice == 'Y'));

		System.out.println("\nCars Registered\n");
	}

	public void printCarDetails() {
		System.out.println("Car Details\n");
		int counter = 1;
		for (Car car : cars) {
			System.out.println("Car " + counter++ + ":\n" + car.getDetails() + "\n");
		}
	}

	public void printFilteredCars() {
		System.out.println("\nSpecial Cars Detected");
		int grayCounter = 0;
		int before2020Counter = 0;

		for (Car car : cars) {
			if (car.getColor().equalsIgnoreCase("gray") && car.getCC() >= 2.0) {
				grayCounter++;
				System.out.println("OMG found the " + grayCounter + "º gray car with CC >= 2.0");
			}
			if (car.getYear() < 2020) before2020Counter++;
		}
		System.out.println("There are " + before2020Counter + " cars built before 2020\n");
	}
}