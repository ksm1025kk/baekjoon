

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String st = br.readLine();
			if (st.equals("0")) {
				break;
			}
			while (true) {
				int a = 0;

				if (st.length() < 2) {
					break;
				} else {
					for (int i = 0; i < st.length(); i++) {
						a += st.charAt(i) - '0';
					}
				}
				st = String.valueOf(a);
			}
			bw.write(st + "");
			bw.newLine();
		}
		bw.flush();
		br.close();
	}

}