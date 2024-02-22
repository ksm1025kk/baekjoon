

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger a = new BigInteger("0");
		BigInteger c = new BigInteger("-1");
		
		while(true) {
			BigInteger b = new BigInteger(br.readLine());
			if(b.equals(c)) {
				break;
			}
			a = a.add(b);
			
		}
		bw.write(a + "");
		bw.flush();
		br.close();
	}

}