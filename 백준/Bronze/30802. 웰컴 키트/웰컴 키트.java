

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str1[] = br.readLine().split(" ");
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(str1[i]);
		}
		String str2[] = br.readLine().split(" ");
		int t = Integer.parseInt(str2[0]);
		int p = Integer.parseInt(str2[1]);
		int tcount = 0;
		for (int i = 0; i < arr.length; i++) {
			tcount += arr[i] / t;
			tcount = arr[i] % t > 0 ? tcount + 1 : tcount;
		}
		bw.write(tcount + " ");
		bw.newLine();
		bw.write((n / p) + " " + (n % p));
		bw.flush();
		br.close();
	}
}
