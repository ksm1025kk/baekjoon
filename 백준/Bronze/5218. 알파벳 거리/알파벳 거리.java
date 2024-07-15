

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
			String str[] = br.readLine().split(" ");
			bw.write("Distances: ");
			for (int i = 0; i < str[0].length(); i++) {
				int w1 = str[0].charAt(i) - 65;
				int w2 = str[1].charAt(i) - 65;
				if (w2 >= w1) {
					bw.write(w2 - w1 + " ");
				} else {
					bw.write(((w2 + 26) - w1) + " ");
				}
			}
			bw.newLine();
		}

		bw.flush();
		br.close();
	}
}
