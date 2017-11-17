package seventh;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(), num2 = scan.nextInt(),sum;
		String result = "";
		for (int i = num1; i <= num2; i++) {
			sum = 0;
			for (int j = 1; j < i; j++)
				if (i % j == 0)
					sum += j;
			if (sum == i)
				result += sum+" ";
		}
		System.out.print(result.trim());
		scan.close();
	}
}
