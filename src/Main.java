import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		StockVeiculos stock = new StockVeiculos();

		stock.registoVeiculos();

		System.out.println("_____Car Details 🥺_____\n");
		for(String msg : stock.detalhesVeiculo()){
			System.out.println(msg);
		}

		System.out.println("\n_____Found some special cars broski 🥺_____");
		for(String msg : stock.filtrosVeiculos()){
			System.out.println(msg);
		}

		System.out.println("Chegaste ao fim do programa twin 🥀💔😭 (no sequel, this ain’t Marvel bro 🦸).");
		System.out.println("Program finished 👉😳👈 uwu 💕 now go touch grass 🌱✨.");
	}
}

