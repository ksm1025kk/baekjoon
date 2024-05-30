

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int ans = 1;
		for (int i = 1; i < str.length; i++) {
			if (Integer.parseInt(str[i - 1]) <= Integer.parseInt(str[i])) {
				ans++;
			}
		}
		bw.write("" + ans);
		bw.flush();
		br.close();
	}
}
