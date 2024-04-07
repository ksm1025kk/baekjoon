

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		String s = br.readLine();
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(s.equals(str[i])) {
				count++;
			}
		}
		bw.write("" + count);
		bw.flush();
		br.close();
	}
}

		