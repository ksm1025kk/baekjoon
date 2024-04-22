

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0")) {
				break;
			}
			String str2[] = str.split(" ");
			int a = Integer.parseInt(str2[0]);
			int b = Integer.parseInt(str2[1]);
			
			int res1 = a/b;
			int res2 = a%b;
			bw.write(res1 + " " + res2 + " / " + b);
			bw.newLine();
		}
		
		bw.flush();
		br.close();
	}
}
