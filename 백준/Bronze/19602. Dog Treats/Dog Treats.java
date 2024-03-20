

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int s = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine());
		
		int res = s + 2*m + 3*l;
		if(res>=10) {
			bw.write("happy");
		}else {
			bw.write("sad");
		}
		bw.flush();
		br.close();
	}
}

		