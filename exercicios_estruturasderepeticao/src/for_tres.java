import java.util.Locale;
import java.util.Scanner;

public class for_tres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite quantas repetições: ");
		int x = sc.nextInt();
		double a = 0, b = 0, c = 0, media = 0;
		for (int i = 1; i <= x; i++) {
			System.out.printf("Digite o 1° valor: ");
			a = sc.nextDouble();
			System.out.printf("Digite o 2° valor: ");
			b = sc.nextDouble();
			System.out.printf("Digite o 3° valor: ");
			c = sc.nextDouble();
			media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("Média: %.1f \n", media);
		}

		sc.close();

	}

}
