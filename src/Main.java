import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double raio2;
		double pi = 3.14159;

		raio2 = Math.pow(raio, 2.0);

		double area = pi * raio2;

		System.out.printf("Area = %.4f%n", area);

		sc.close();

	}

}
