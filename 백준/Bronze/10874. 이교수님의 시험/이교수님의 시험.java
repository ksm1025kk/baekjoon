

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		for (int i = 1; i <= count; i++) {
			int score = 0;
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < str.length; j++) {
				if (Integer.parseInt(str[j]) == (((j + 1) - 1) % 5) + 1) {
					score++;
				}
			}
			if (score == str.length) {
				bw.write(i + "");
				bw.newLine();
			}
		}
		bw.flush();
		br.close();
	}
}
