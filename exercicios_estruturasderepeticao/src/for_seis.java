import java.util.Scanner;

public class for_seis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		int n = sc.nextInt();
		System.out.println("Seus divisores:");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
