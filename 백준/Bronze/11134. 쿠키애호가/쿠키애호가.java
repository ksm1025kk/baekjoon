

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			int day = 0;
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);
			int res = n/c;
			int res2 = n%c;
			if(res2 != 0) {
				res++;
			}
			bw.write("" + res);
			count--;
			bw.newLine();
		}
		
		bw.flush();
		br.close();
	}
}
