import java.util.Locale;
import java.util.Scanner;

public class for_quatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantas repetições: ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.printf("Digite o numerador: ");
			float num = sc.nextInt();
			System.out.printf("Digite o denominador: ");
			float den = sc.nextInt();
			
			if (den == 0) {
				System.out.printf("Divisão Impossivel \n\n");
			}else {
				float media = num/den;
				System.out.printf("Média: %.1f \n\n", media);
			}
		}
		sc.close();
	}

}
