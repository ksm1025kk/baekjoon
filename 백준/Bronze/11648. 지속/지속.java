

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int count = 0;
		while(true) {
			if(str.length() == 1) {
				break;
			}
			String s[] = str.split("");
			int num = 1;
			for(int i = 0; i < s.length; i++) {
				num *= Integer.parseInt(s[i]);
			}
			str = Integer.toString(num);
			count++;
		}
		bw.write("" + count);
		bw.flush();
		br.close();
	}
}

		