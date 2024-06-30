

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		int min =Integer.MIN_VALUE;
		
		String num[] = br.readLine().split(" ");
		for(int i = 0; i < n - k + 1; i++) {
			int sum = 0;
			for(int j = 0; j < k; j++) {
				sum = sum + Integer.parseInt(num[i+j]);
			}
			if(sum>min) {
				min = sum;
			}
		}
		bw.write(min + "");
		bw.flush();
		bw.close();
	}
}
