import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int MAX_CARS = 100;
		int[] id = new int[MAX_CARS];
		String[] brand = new String[MAX_CARS];
		String[] carmodel = new String[MAX_CARS];
		String[] color = new String[MAX_CARS];
		double[] CC = new double[MAX_CARS];
		boolean[] IsAutomatic = new boolean[MAX_CARS];
		int[] year = new int[MAX_CARS];
		
		int totalCars = 0;
		char choice;
		
		do {
			System.out.println("Car Brand?");
			brand[totalCars] = input.nextLine();
			
			System.out.println("Car Model?");
			carmodel[totalCars] = input.nextLine();
			
			System.out.println("Car Color?");
			color[totalCars] = input.nextLine();
			
			System.out.println("How much CC?");
			CC[totalCars] = input.nextDouble();
			
			System.out.println("Is automatic or manual? (a/m)");
			char mudancas = input.next().charAt(0);
			IsAutomatic[totalCars] = (mudancas == 'a' || mudancas == 'A');
			
			System.out.println("Car ID?");
			id[totalCars] = input.nextInt();
			
			System.out.println("Car Year?");
			year[totalCars] = input.nextInt();
			input.nextLine();
			
			totalCars++;
			
			System.out.println("\nDo you wish to continue? (y/n)");
			choice = input.next().charAt(0);
			input.nextLine();
			
		} while ((choice == 'y' || choice == 'Y') && totalCars < MAX_CARS);
		
		System.out.println("\n--- Car List ---");
		for (int i = 0; i < totalCars; i++) {
			System.out.println("Car " + (i + 1) + ":");
			System.out.println("Brand: " + brand[i]);
			System.out.println("Model: " + carmodel[i]);
			System.out.println("Color: " + color[i]);
			System.out.println("CC: " + CC[i]);
			System.out.println("Gear: " + (IsAutomatic[i] ? "Automatic" : "Manual"));
			System.out.println("ID: " + id[i]);
			System.out.println("Year: " + year[i]);
			
			switch (brand[i].toLowerCase()) {
				case "audi":
				case "bmw":
				case "mercedes":
					System.out.println("German Car");
					break;
				case "toyota":
				case "honda":
				case "nissan":
					System.out.println("Japanese Car");
					break;
				case "ford":
				case "chevrolet":
				case "tesla":
					System.out.println("American Car");
					break;
				case "fiat":
				case "ferrari":
				case "lamborghini":
					System.out.println("Italian Car");
					break;
				case "peugeot":
				case "renault":
				case "citroen":
					System.out.println("French Car");
					break;
				default:
					System.out.println("Other Manufacturer");
					break;
			}
			
			if (CC[i] >= 2.0) {
				System.out.println("Very good car");
			} else {
				System.out.println("Mid car");
			}
			System.out.println();
		}
		
		int GrayCounter = 0;
		int before2020Counter = 0;
		
		for (int i = 0; i < totalCars; i++) {
			if (color[i].equalsIgnoreCase("Gray") && CC[i] >= 2.0) {
				GrayCounter++;
				System.out.println("Found the " + GrayCounter + "º car that is both gray and has CC equal or above 2.0: " + brand[i] + " " + carmodel[i]);
			}
			if (year[i] < 2020) {
				before2020Counter++;
			}
		}
		
		System.out.println("There are " + before2020Counter + " cars before 2020.");
		System.out.println("Chegaste ao fim do programa twin\uD83E\uDD40\uD83D\uDC94!");
		input.close();
	}
}
