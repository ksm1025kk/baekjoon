

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		while (a != 0) {
			String str[] = br.readLine().split(" ");
			bw.write("god");
			for(int i = 1; i < str.length; i++) {
				bw.write(str[i]);
			}
			bw.newLine();
			a--;
		}
		bw.flush();
		br.close();
	}

}