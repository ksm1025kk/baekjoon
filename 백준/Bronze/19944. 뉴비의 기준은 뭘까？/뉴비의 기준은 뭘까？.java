

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		if(m == 1 || m == 2) {
			bw.write("NEWBIE!");
		}else if(m<=n) {
			bw.write("OLDBIE!");
		}else {
			bw.write("TLE!");
		}
		bw.flush();
		br.close();
	}
}

		