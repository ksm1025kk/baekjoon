

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int m = Integer.parseInt(str[3]);
		int p = 0;
		int w = 0;

		for (int i = 1; i <= 24; i++) {

			if (a > m) {
				break;

			}

			if (p + a <= m) {
				p += a;
				w += b;
			} else {
				p = p - c < 0 ? 0 : p - c;
			}
		}
		bw.write(w + "");
		bw.flush();
		br.close();
	}
}
