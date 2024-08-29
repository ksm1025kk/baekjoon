

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while (count-- != 0) {
			int n = Integer.parseInt(br.readLine());
			String S = "Pairs for " + n + ": ";
			for(int j = 1; j <= n / 2; j++) {
				if(j != (n - j)) {
					if(j > 1) {
						S += ", ";
					}
					S += j + " " + (n - j);
				}
			}
			bw.write(S);
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}

