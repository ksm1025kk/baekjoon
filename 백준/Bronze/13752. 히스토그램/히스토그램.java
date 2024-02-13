

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		while (a != 0) {
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++) {
				bw.write("=");
			}
			bw.newLine();
			a--;
		}
		bw.flush();
		br.close();
	}
}