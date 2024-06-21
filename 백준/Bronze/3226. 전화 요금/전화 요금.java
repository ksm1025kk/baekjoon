

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int ans = 0;
		while (count != 0) {
			String str[] = br.readLine().split(" ");
			String s[] = str[0].split(":");
			int H = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int D = Integer.parseInt(str[1]);

			int eH = H;
			int eM = M;

			if (M + D < 60) {
				eM = M + D;
			} else {
				int Q = (M + D) / 60;
				eM = (M + D) % 60;
				if (H + Q < 24) {
					eH = H + Q;
				} else {
					eH = (H + Q) % 24;
				}
			}
			if (H == 6 && eH == 7) {
				ans += (D - eM) * 5 + eM * 10;
			} else if (H == 18 && eH == 19) {
				ans += (D - eM) * 10 + eM * 5;
			} else {
				if (6 < H && H < 19) {
					ans += 10 * D;
				} else {
					ans += 5 * D;
				}
			}
			count--;
		}
		bw.write("" + ans);
		bw.flush();
		br.close();
	}
}
