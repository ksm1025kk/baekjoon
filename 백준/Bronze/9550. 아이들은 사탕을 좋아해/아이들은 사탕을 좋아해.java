

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		while(a!=0) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			String str2[] = br.readLine().split(" ");
			int count = 0;
			for(int i = 0; i < n; i++) {
				count += Integer.parseInt(str2[i])/k;
			}
			bw.write(count + "");
			bw.newLine();
			a--;
		}
		
		bw.flush();
		br.close();
	}
}
