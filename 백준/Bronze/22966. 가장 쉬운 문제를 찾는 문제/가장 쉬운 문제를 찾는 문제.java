

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String arr[][] = new String[n][2];
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
				arr[i][0] = str[0];
				arr[i][1] = str[1];
			
		}
		int min = Integer.parseInt(arr[0][1]);
		int mw = 0;
		for (int i = 0; i < n; i++) {
			if (min > Integer.parseInt(arr[i][1])) {
				min = Integer.parseInt(arr[i][1]);
				mw = i;
			}
		}
		bw.write(arr[mw][0]);
		bw.flush();
		br.close();
	}
}
