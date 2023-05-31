import java.util.Scanner;

public class while_um {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: %n");
		int senha = sc.nextInt();;
		
		while (senha != 2002) {
			System.out.println("Senha Inválida!");
			System.out.println("----------------");
			System.out.println("Digite a senha:");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
