import java.util.Scanner;

public class for_cinco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int fatorial = 1;

		System.out.printf("Digite o valor de n: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n == 0) {
				fatorial = 1;
			} else {
				fatorial = fatorial * i;
			}
		}
		System.out.println(fatorial);

		sc.close();

	}

}
