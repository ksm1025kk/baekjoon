

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger a = new BigInteger(br.readLine());
		String b = br.readLine();
		BigInteger c = new BigInteger(br.readLine());

		if(b.equals("+")) {
			bw.write(a.add(c).toString());
		}else {
			bw.write(a.multiply(c).toString());
		}
		
		bw.flush();
		bw.close();
	}
}
