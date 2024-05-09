

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str[][] = new String[n][n];
		for(int i = 0; i < n; i++) {
			String a[] = br.readLine().split("");
			for(int j = 0; j < n; j++) {
				str[i][j] = a[j];
			}
		}
		
		int num = Integer.parseInt(br.readLine());
		if(num == 1) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					bw.write(str[i][j]);
				}
				bw.newLine();
			}
		}else if(num == 2) {
			for(int i = 0; i < n; i++) {
				for(int j = n-1; j >= 0; j--) {
					bw.write(str[i][j]);
				}
				bw.newLine();
			}
		}else {
			for(int i = n-1; i >=0 ; i--) {
				for(int j = 0; j < n; j++) {
					bw.write(str[i][j]);
				}
				bw.newLine();
			}
		}
		
		bw.flush();
		br.close();
	}
}
