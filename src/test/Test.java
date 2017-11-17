package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		String cal = scan.nextLine();
		System.out.print(calculate(cal));
		scan.close();
	}

	public static long calculate(String str) {
		if (str.contains("+")) {
			return calculate(str.substring(0, str.indexOf("+")))
					+ calculate(str.substring(str.indexOf("+") + 1));
		} else if (str.contains("-")) {
			return calculate(str.substring(0, str.indexOf("-")))
					- calculate(str.substring(str.indexOf("-") + 1));
		} else if (str.contains("*")) {
			return calculate(str.substring(0, str.indexOf("*")))
					* calculate(str.substring(str.indexOf("*") + 1));
		} else if (str.contains("/")) {
			if (str.substring(str.indexOf("/") + 1).contains("/")) {
				String[] tmp = str.split("/");
				long res = Long.parseLong(tmp[0]);
				for (int i = 1; i < tmp.length; i++) {
					res /= Long.parseLong(tmp[i]);
				}
				return res;
			} else {
				return calculate(str.substring(0, str.indexOf("*")))
						/ calculate(str.substring(str.indexOf("*") + 1));
			}
		} else {
			return Long.parseLong(str);
		}
	}
}
