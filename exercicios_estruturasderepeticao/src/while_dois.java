import java.util.Scanner;

public class while_dois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;

		System.out.println("Digite o valor de X: ");
		x = sc.nextInt();
		System.out.println("Digite o valor de Y: ");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			}
			System.out.println("---------------------");
			System.out.println("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.println("Digite o valor de Y: ");
			y = sc.nextInt();
		}

		sc.close();

	}

}
