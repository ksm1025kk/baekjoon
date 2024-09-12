

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[3];
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		String w = br.readLine();
		Arrays.sort(arr);

		for (int j = 0; j < arr.length; j++) {
			if ('A' == w.charAt(j)) {
				bw.write(arr[0] + " ");
			} else if ('B' == w.charAt(j)) {
				bw.write(arr[1] + " ");
			} else if ('C' == w.charAt(j)) {
				bw.write(arr[2] + " ");
			}
		}
		bw.flush();
		br.close();
	}
}
