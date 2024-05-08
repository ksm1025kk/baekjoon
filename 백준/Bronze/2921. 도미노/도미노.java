

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				sum = sum + i + j;
			}
		}
		bw.write(sum + "");
		bw.flush();
		br.close();
	}
}
