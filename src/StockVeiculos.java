import java.util.ArrayList;
import java.util.Scanner;

public class StockVeiculos {

	int MAX_CARS = 100;
	int[] id;
	int[] year;
	double[] CC;
	String[] brand;
	String[] carmodel;
	String[] color;
	boolean[] IsAutomatic;
	int totalCars;

	public StockVeiculos(){
		id = new int[MAX_CARS];
		year = new int[MAX_CARS];
		CC = new double[MAX_CARS];
		brand = new String[MAX_CARS];
		carmodel = new String[MAX_CARS];
		color = new String[MAX_CARS];
		IsAutomatic = new boolean[MAX_CARS];
		totalCars = 0;
	}

	public void registoVeiculos() {
		Scanner input = new Scanner(System.in);
		char choice;

		do {

			System.out.println("Car Brand 🥺👉👈? (don’t lie or I’ll cry frfr 😔)");
			brand[totalCars] = input.nextLine();

			System.out.println("Car Model 👉😳👈? (plz make it aesthetic ✨)");
			carmodel[totalCars] = input.nextLine();

			System.out.println("Car Color 🌈🦄? (if it’s gray ur basically an NPC 🥱)");
			color[totalCars] = input.nextLine();

			System.out.println("How much CC 💨💀? (the higher, the zoomier 🏎️💨🔥)");
			CC[totalCars] = input.nextDouble();

			System.out.println("Is it automatic 🤖 or manual 🏋️‍♂️? (press 'a' if u lazy af 😌)");
			char mudancas = input.next().charAt(0);
			IsAutomatic[totalCars] = (mudancas == 'a' || mudancas == 'A');

			System.out.println("Car ID 🔑😳? (pick carefully, it’s ur car’s zodiac sign ✨♓)");
			id[totalCars] = input.nextInt();

			System.out.println("Car Year 📅🥺? (pls not 1999... we don’t want Y2K vibes 😭)");
			year[totalCars] = input.nextInt();
			input.nextLine();

			totalCars++;

			System.out.println("\nDo you wish to continue 🥺? (y/n)");
			choice = input.next().charAt(0);
			input.nextLine();
		} while ((choice == 'y' || choice == 'Y') && totalCars < MAX_CARS);

		System.out.println("\n--- Cars Registered 🥺 ---\n");
	}

	public String[] detalhesVeiculo() {
		ArrayList<String> mensagens = new ArrayList<>();

		for (int i = 0; i < totalCars; i++) {
			String msg = "";
			msg += "Car " + (i + 1) + ":\n";
			msg += "Brand: " + brand[i] + " ✨ (sponsored by broke dreams 🥲)\n";
			msg += "Model: " + carmodel[i] + " 🚗 (probably faster than my WiFi rn 💀)\n";
			msg += "Color: " + color[i] + " 🎨 (drip or drown 😎)\n";
			msg += "CC: " + CC[i] + " 💨 (more CC = more rizz fr 🤑)\n";
			msg += "Gear: " + (IsAutomatic[i] ? "Automatic 🤖 (lazy driver arc 😴)" : "Manual 🏋️‍♂️ (sigma grindset activated 😤)") + "\n";
			msg += "ID: " + id[i] + " 🔑 (this car lowkey got a gamer tag 🎮)\n";
			msg += "Year: " + year[i] + " 📅 (built different… or just old 💀)\n";

			switch (brand[i].toLowerCase()) {
				case "audi":
				case "bmw":
				case "mercedes":
					msg += "German Car 🇩🇪 (built like a bratwurst on steroids 🌭💪)\n";
					break;
				case "toyota":
				case "honda":
				case "nissan":
					msg += "Japanese Car 🇯🇵 (fast but also kawaii uwu 🥺🍣)\n";
					break;
				case "ford":
				case "chevrolet":
				case "tesla":
					msg += "American Car 🇺🇸 (probably runs on McDonalds grease 🍔🥤)\n";
					break;
				case "fiat":
				case "ferrari":
				case "lamborghini":
					msg += "Italian Car 🇮🇹 (loud, dramatic, and always late like ur ex 💋🍕)\n";
					break;
				case "peugeot":
				case "renault":
				case "citroen":
					msg += "French Car 🇫🇷 (baguette-shaped aerodynamics 🥖✨)\n";
					break;
				default:
					msg += "Other Manufacturer 🤡 (budget mode unlocked 🤑)\n";
			}

			msg += (CC[i] >= 2.0 ? "Very good car 🏎️💨 (zoom zoom, max rizz 😈)" : "Mid car 😔 (like that one group project teammate 💀)");
			mensagens.add(msg);
		}

		// criar um array para guardar os detalhes dos carrinhos à lista 🥺
		String[] arrayFinal = new String[mensagens.size()];
		int j = 0;
		// iterar pela lista para adicionar os detalhes dos carrinhos ao array 🥺
		for (String m : mensagens) {
			arrayFinal[j++] = m;
		}
		return arrayFinal;
	}

	public String[] filtrosVeiculos(){
		ArrayList<String> mensagens = new ArrayList<>();
		int grayCounter = 0;
		int before2020Counter = 0;

		for(int i = 0; i < totalCars; i++) {
			if(color[i].equalsIgnoreCase("gray") && CC[i] >= 2.0){
				grayCounter++;
				mensagens.add("OMG 🤯 found the " + grayCounter + "º gray car 🚗💨 with CC >= 2.0 (this one’s literally a stealth fighter jet 🛩️🔥)\n");
			}
			if(year[i] < 2020){
				before2020Counter++;
			}
		}
		mensagens.add("There are " + before2020Counter + " cars built before 2020 😭 (aka prehistoric fossils 🦖🚗)\n");

		// mesma merda lá de cima 🥺
		String[] arrayFinalN2 = new String[mensagens.size()];
		int j = 0;
		for(String m : mensagens){
			arrayFinalN2[j++] = m;
		}

		return arrayFinalN2;
	}

}


