import java.util.Scanner;

public class for_dois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite quantas repetições: ");
		int vezes = sc.nextInt();
		int in = 0, out = 0, num;

		for (int i = 1; i <= vezes; i++) {
			System.out.printf("Digite %d número:", i);
			num = sc.nextInt();
			if (num >= 10 & num <= 20) {
				in++;
			} else {
				out++;
			}
		}
		System.out.println("");
		System.out.println(in + "in");
		System.out.println(out + "out");

		sc.close();

	}

}
