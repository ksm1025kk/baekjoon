

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String arr1[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		int arr2[] = { 3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

		String str1[] = br.readLine().split(" ");
		int n = Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str1[1]);
		String str2[] = br.readLine().split(" ");
		String str3[] = str2[0].split("");
		String str4[] = str2[1].split("");

		String word = "";
		for (int i = 0; i < Math.max(n, m); i++) {
			if (i >= Math.min(n, m)) {
				if(n>=m) {
					word += str3[i];
				}else {			
					word += str4[i];
				}
			} else {
				word += str3[i] + str4[i];
			}
		}
		
		String str5[] = word.split("");
		String str6 = "";
		for (int i = 0; i < str5.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (str5[i].equals(arr1[j])) {
					str6 += arr2[j];
				}
			}
		}
		while (true) {
			String str7[] = str6.split("");
			String str8 = "";
			if (str7.length == 2) {
				break;
			}
			for (int i = 0; i < str7.length - 1; i++) {
				int a = Integer.parseInt(str7[i]) + Integer.parseInt(str7[i + 1]);
				if (a >= 10) {
					String str9[] = Integer.toString(a).split("");
					str8 += str9[1];
				} else {
					str8 += Integer.toString(a);
				}
			}
			str6 = str8;
		}
		String res[] = str6.split("");
		if(res[0].equals("0")) {
			bw.write(res[1] + "%");
		}else {
			bw.write(str6 + "%");
		}
		bw.flush();
		br.close();
	}
}
