import java.util.Scanner;

public class for_sete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite um número: ");
		int n = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d  |", x);
			int quadrado = x*x;
			System.out.printf("%d  |", quadrado);
			int cubo = x*x*x;
			System.out.printf("%d  \n", cubo);
			x++;
		}

		sc.close();

	}

}
