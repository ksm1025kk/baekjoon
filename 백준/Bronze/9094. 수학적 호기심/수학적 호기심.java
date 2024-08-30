

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
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int res = 0;
			for (int i = 1; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (((i * i) + (j * j) + m) % (i * j) == 0) {
						res++;
					}
				}
			}
			bw.write(res + "");
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
