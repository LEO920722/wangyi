package sixth;

import java.util.Scanner;

public class SentenceLength {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		String sen = scan.nextLine();
		sen = sen.replace('.', ' ');
		if (!sen.equals("")) {
			String[] sens = sen.split("\\s+");
			for (int i = 0; i < sens.length; i++) {
				if (i == sens.length - 1) {
					System.out.print(sens[i].length());
				} else {
					System.out.print(sens[i].length() + " ");
				}
			}
		} else {
			System.out.print("0");
		}
		scan.close();

	}
}
