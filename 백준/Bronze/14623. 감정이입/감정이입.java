

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String B1 = br.readLine();
		String B2 = br.readLine();

		long i = Long.parseLong(B1, 2);
		long i2 = Long.parseLong(B2, 2);

		String sum = Long.toBinaryString(i * i2);
		bw.write(sum);
		bw.flush();
		br.close();
	}
}
