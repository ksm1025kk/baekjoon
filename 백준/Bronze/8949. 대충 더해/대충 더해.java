

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		String a = str[0];
		String b = str[1];
		int gap = Math.abs(a.length() - b.length());
		if (a.length() < b.length()) {
			a = "0".repeat(gap) + a;
		} else {

			b = "0".repeat(gap) + b;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			sb.append(a.charAt(i) - '0' + b.charAt(i) - '0');
		}
		bw.write(sb.toString());

		bw.flush();
		br.close();
	}
}
