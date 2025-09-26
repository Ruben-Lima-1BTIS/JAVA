import java.util.Scanner;

public class OneMoreEX {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello Everyone");
		
		System.out.println("What do I call you weakling?\n");
		
		String name = input.nextLine();
		System.out.printf("Very well, hello " + name);
	}
}
