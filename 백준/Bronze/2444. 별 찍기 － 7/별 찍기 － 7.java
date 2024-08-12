

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		for (int i = 1; i <= a; i++) {
			for (int j = 0; j < a - i; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < i*2 - 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		for (int i = a-1; i >= 0; i--) {
			for (int j = 0; j < a - i; j++) {
				bw.write(" ");
			}
			for (int j = 0; j < i*2 - 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
