

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String t = br.readLine();
		String tt = br.readLine();
		int[] a = new int[100001];
		int[] b = new int[100001];
		for (int i = 0; i < t.length(); i++) {
			a[i] = t.charAt(i) - '0';
			b[i] = tt.charAt(i) - '0';
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t.length(); i++)
			sb.append(a[i] & b[i]);
		sb.append("\n");

		for (int i = 0; i < t.length(); i++)
			sb.append(a[i] | b[i]);
		sb.append("\n");

		for (int i = 0; i < t.length(); i++)
			sb.append(a[i] ^ b[i]);
		sb.append("\n");

		for (int i = 0; i < t.length(); i++)
			sb.append(a[i] ^ 1);
		sb.append("\n");

		for (int i = 0; i < t.length(); i++)
			sb.append(b[i] ^ 1);
		sb.append("\n");
		bw.write(sb.toString());
		bw.flush();
		br.close();
	}
}
