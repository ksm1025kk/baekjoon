

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while (count != 0) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder(str);
			String word = sb.reverse().toString();

			String num[] = Integer.toString(Integer.parseInt(str) + Integer.parseInt(word)).split("");
			/*
			 * bw.write(num.length + ""); bw.newLine(); for(String i:num) { bw.write(i +
			 * " "); } bw.newLine();
			 */

			switch (num.length) {
			case 2: {
				if (num[0].equals(num[1])) {
					bw.write("YES");
					break;
				} else {
					bw.write("NO");
					break;
				}
			}
			case 3: {
				if (num[0].equals(num[2])) {
					bw.write("YES");
					break;
				} else {
					bw.write("NO");
					break;
				}
			}
			case 4: {
				if (num[0].equals(num[3]) && num[1].equals(num[2])) {
					bw.write("YES");
					break;
				} else {
					bw.write("NO");
					break;
				}
			}
			case 5: {
				if (num[0].equals(num[4]) && num[1].equals(num[3])) {
					bw.write("YES");
					break;
				} else {
					bw.write("NO");
					break;
				}
			}
			case 6: {
				if (num[0].equals(num[5]) && num[1].equals(num[4]) && num[2].equals(num[3])) {
					bw.write("YES");
					break;
				} else {
					bw.write("NO");
					break;
				}
			}
			}
			bw.newLine();
			count--;
		}

		bw.flush();
		br.close();
	}
}