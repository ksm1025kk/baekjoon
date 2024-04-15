

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
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			double d = Double.parseDouble(str[1]);
			int res = 0;
			while(n!=0) {
				String str2[] = br.readLine().split(" ");
				double v = Double.parseDouble(str2[0]);
				double f = Double.parseDouble(str2[1]);
				double c = Double.parseDouble(str2[2]);
				
				if((d / v) * c <= f) {
					res++;
				}
				n--;
			}
			bw.write("" + res);
			bw.newLine();
			count--;
		}
		bw.flush();
		br.close();
	}
}
