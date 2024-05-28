

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cas = 1;
		while(n!=0) {
			String str[] = br.readLine().split(" ");
			int num = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
			bw.write("Case " + cas + ": " + num);
			bw.newLine();
			cas++;
			n--;
		}
		bw.flush();
		br.close();
	}
}
