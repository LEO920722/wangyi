package sixth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class GPS {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		while (scan.hasNext()) {
			String GPS = scan.nextLine();
			if (GPS.contains("GPRMC")) {
				arr.add(GPS);
			} else if (GPS.equals("END")) {
				break;
			}
		}
		String[] str = (String[]) arr.toArray(new String[0]);
		SimpleDateFormat format1 = new SimpleDateFormat("HHmmss");
		SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss");
		String timeStirng = null;
		for (int i = 0;i<str.length;i++) {
			String sub = str[i].substring(str[i].indexOf("$") + 1, str[i].indexOf("*"));
			String[] subs = str[i].split(",");
			int xor = sub.charAt(0);
			for (int x = 1; x < sub.length(); x++) {
				xor ^= sub.charAt(x);
			}
			xor %= 65336;
			if (!Integer.toHexString(xor).equals(
					str[i].substring(str[i].indexOf("*") + 1))) {
				continue;
			} else if (!subs[2].equals("A")) {
				continue;
			} else {
				double oldTime = Double.valueOf(subs[1]);
				double newTime = oldTime + 80000;
				if (newTime > 240000) {
					newTime -= 240000;
				}
				int time = (int) newTime;
				timeStirng = Integer.toString(time);
				if (timeStirng.length() < 6) {
					switch (timeStirng.length()) {
					case 0: {
						timeStirng = "000000";
						break;
					}
					case 1: {
						timeStirng = "00000" + timeStirng;
						break;
					}
					case 2: {
						timeStirng = "0000" + timeStirng;
						break;
					}
					case 3: {
						timeStirng = "000" + timeStirng;
						break;
					}
					case 4: {
						timeStirng = "00" + timeStirng;
						break;
					}
					case 5: {
						timeStirng = "0" + timeStirng;
						break;
					}
					}
				}
			}

		}
		try {
			if (timeStirng != null) {
				System.out.println(format2.format(format1.parse(timeStirng)));
			}
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		scan.close();
	}
}
