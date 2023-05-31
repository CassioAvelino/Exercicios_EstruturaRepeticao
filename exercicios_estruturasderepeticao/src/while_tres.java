import java.util.Scanner;

public class while_tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, num;

		System.out.println("POSTÃO DO POVO");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Fim");
		System.out.println("=================");
		System.out.println("Digite um número:");
		num = sc.nextInt();

		while (num != 4) {
			if (num == 1) {
				alcool += 1;
			} else if (num == 2) {
				gasolina += 1;
			} else if (num == 3) {
				diesel += 1;
			} else {
				System.out.println("Número invalido");
			}
			num = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool %d%n", alcool);
		System.out.printf("Gasolina %d%n", gasolina);
		System.out.printf("Diesel %d%n", diesel);

		sc.close();

	}
}
