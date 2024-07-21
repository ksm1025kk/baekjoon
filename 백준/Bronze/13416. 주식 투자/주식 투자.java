

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t != 0) {
			int max = 0;

			int n = Integer.parseInt(br.readLine());
			while (n != 0) {

				String str[] = br.readLine().split(" ");
				if (str.length == 3) {
					int a = Integer.parseInt(str[0]);
					int b = Integer.parseInt(str[1]);
					int c = Integer.parseInt(str[2]);

					if (!(a < 0 && b < 0 && c < 0)) {
						max += Math.max(Math.max(a, b), c);
					}
				}
				n--;
			}

			bw.write(max + "");
			bw.newLine();
			t--;
		}

		bw.flush();
		br.close();
	}
}
