

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while (count-- != 0) {
			String str = br.readLine();
			int g = 0;
			int b = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'g' || str.charAt(i) == 'G') {
					g++;
				}else if(str.charAt(i) == 'b' || str.charAt(i) == 'B') {
					b++;
				}
			}
			if(g>b) {
				bw.write(str + " is GOOD");
			}else if(g<b) {
				bw.write(str + " is A BADDY");
			}else {
				bw.write(str + " is NEUTRAL");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
