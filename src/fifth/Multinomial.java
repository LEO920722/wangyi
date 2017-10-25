package fifth;

import java.util.HashMap;
import java.util.Scanner;

public class Multinomial {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashMap<String,String> map = new HashMap<String,String>();
		Scanner in1 = new Scanner(System.in);
		do {
			String power = String.valueOf(in1.nextInt());
			String mod = String.valueOf(in1.nextInt());
			if (!map.containsKey(power)) {
				map.put(power,mod);
			} else {
				map.put(power,String.valueOf(Integer.parseInt(map.get(power))+mod));
			}
		} while (in1.nextLine().contains("0"));
		Scanner in2 = new Scanner(System.in);
		do {
			
		} while (in2.nextLine().contains("0"));
		in1.close();
		in2.close();
	}
}
