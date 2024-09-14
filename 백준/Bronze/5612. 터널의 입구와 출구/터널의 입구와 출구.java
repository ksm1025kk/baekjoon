

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int max = m;
		while (n-- != 0) {
			String str[] = br.readLine().split(" ");
			int in = Integer.parseInt(str[0]);
			int out = Integer.parseInt(str[1]);
			m += in;
			m -= out;
			max = Math.max(max, m);
			if (m < 0) {
				max = 0;
				break;
			}

		}
		bw.write(max + "");
		bw.flush();
		br.close();
	}
}
