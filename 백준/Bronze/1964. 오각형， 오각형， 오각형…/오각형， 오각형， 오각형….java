

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N + 1];
		arr[1] = 5;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + (i * 5) + (1 - (i * 2));
		}

		bw.write(arr[N] % 45678 + "");
		bw.flush();
		br.close();
	}

}
