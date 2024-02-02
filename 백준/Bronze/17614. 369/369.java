

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int crap = 0;
		String str = "";
		char n;
		for(int i = 1; i <= count; i++) {
			str = Integer.toString(i);
			for(int j = 0; j < str.length(); j++) {
				n = str.charAt(j);
				if(n == '3' || n=='6' || n=='9') {
					crap++;
				}
			}
		}
			
		bw.write("" + crap);
		bw.flush();
		br.close();
	}
}

