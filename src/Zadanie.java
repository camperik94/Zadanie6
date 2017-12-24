import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		System.out.println("To jest kalkulator");
		
		Scanner in = new Scanner(System.in);
		
		double liczba1 = in.nextDouble();
		char zn = in.next().charAt(0);
		double liczba2 = in.nextDouble();

		Kalkulator calc = new Kalkulator(liczba1, liczba2, zn);
		
		switch(zn) {
			case '+':
				calc.funkcja();
				break;
			case '-':
				calc.funkcja();
				break;
			case '*':
				calc.funkcja();
				break;
			case '/':
				calc.funkcja();
				break;
		}
			
	}
}
