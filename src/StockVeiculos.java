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
			System.out.println("Car Brand 🥺?");
			brand[totalCars] = input.nextLine();
			
			System.out.println("Car Model 🥺?");
			carmodel[totalCars] = input.nextLine();
			
			System.out.println("Car Color 🥺?");
			color[totalCars] = input.nextLine();
			
			System.out.println("How much CC 🥺?");
			CC[totalCars] = input.nextDouble();
			
			System.out.println("Is automatic or manual 🥺? (a/m)");
			char mudancas = input.next().charAt(0);
			IsAutomatic[totalCars] = (mudancas == 'a' || mudancas == 'A');
			
			System.out.println("Car ID 🥺?");
			id[totalCars] = input.nextInt();
			
			System.out.println("Car Year 🥺?");
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
			msg += "Brand: " + brand[i] + "\n";
			msg += "Model: " + carmodel[i] + "\n";
			msg += "Color: " + color[i] + "\n";
			msg += "CC: " + CC[i] + "\n";
			msg += "Gear: " + (IsAutomatic[i] ? "Automatic 🥺" : "Manual 🥺") + "\n";
			msg += "ID: " + id[i] + "\n";
			msg += "Year: " + year[i] + "\n";
			
			switch (brand[i].toLowerCase()) {
				case "audi":
				case "bmw":
				case "mercedes":
					msg += "German Car 🥺\n";
					break;
				case "toyota":
				case "honda":
				case "nissan":
					msg += "Japanese Car 🥺\n";
					break;
				case "ford":
				case "chevrolet":
				case "tesla":
					msg += "American Car 🥺\n";
					break;
				case "fiat":
				case "ferrari":
				case "lamborghini":
					msg += "Italian Car 🥺\n";
					break;
				case "peugeot":
				case "renault":
				case "citroen":
					msg += "French Car 🥺\n";
					break;
				default:
					msg += "Other Manufacturer 🥺\n";
			}
			
			msg += (CC[i] >= 2.0 ? "Very good car 🥺" : "Mid car 🥺");
			
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
				mensagens.add("Found the " + grayCounter + "º car that is both gray and has CC >= 2.0 🥺: "
						+ brand[i] + " " + carmodel[i] + "\n");
			}
			if(year[i] < 2020){
				before2020Counter++;
			}
		}
		mensagens.add("There are " + before2020Counter + " cars before 2020 🥺\n");
		
		// mesma merda lá de cima 🥺
		String[] arrayFinalN2 = new String[mensagens.size()];
		int j = 0;
		for(String m : mensagens){
			arrayFinalN2[j++] = m;
		}
		
		return arrayFinalN2;
	}
	
}
