import java.util.ArrayList;
import java.util.Arrays;

public class AnotherEX {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ruben");
		names.addAll(Arrays.asList("Drake", "The Weeknd", "Frank Ocean", "PARTYNEXTDOOR"));
		
		for (String nome : names) {
			System.out.println("Hello " + nome);
		}
	}
}