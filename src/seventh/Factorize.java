package seventh;

import java.util.Scanner;

public class Factorize {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		System.out.print(sum + "=");
		while (sum > 1) {
			for (int i = 2; i <= sum; i++) {
				if (sum % i == 0) {
					if (sum / i == 1) {
						System.out.print(i);
						sum /= i;
						break;
					} else {
						System.out.print(i + "x");
						sum /= i;
						break;
					}
				}
			}
		}
		scan.close();
	}
}
