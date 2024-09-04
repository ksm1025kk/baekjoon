

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int M = Integer.parseInt(str[2]);
		int T = Integer.parseInt(str[3]);
		int R = Integer.parseInt(str[4]);
		int count = 0;
		int min = m;
		if ((M - m) < T) {
			bw.write("-1");
		} else {
			while (true) {
				if ((m + T) <= M) {
					m += T;
					N--;
				} else {
					m -= R;
				}
				if (m < min) {
					m = min;
				}

				count++;
				if (N == 0) {
					break;
				}
			}
			bw.write(count + "");
		}
		bw.flush();
		br.close();
	}
}
