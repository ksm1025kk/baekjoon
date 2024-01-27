

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String N = br.readLine();
			if (N.equals("0")) {
				break;
			}
			String str[] = N.split("");
			int one = 2;
			int zero = 4;
			int els = 3;
			int size = 0;
			for (String i : str) {
				if (i.equals("1")) {
					size += one;
				} else if (i.equals("0")) {
					size += zero;
				} else {
					size += els;
				}
			}
			switch (str.length) {
			case 1: {
				bw.write("" + (size + 2));
				bw.newLine();
				break;
			}
			case 2: {
				bw.write("" + (size + 3));
				bw.newLine();
				break;
			}
			case 3: {
				bw.write("" + (size + 4));
				bw.newLine();
				break;
			}
			case 4: {
				bw.write("" + (size + 5));
				bw.newLine();
				break;
			}
			}
		}
		bw.flush();
		br.close();

	}
}
