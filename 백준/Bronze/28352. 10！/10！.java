

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long a = Long.parseLong(br.readLine());
		long num = 1;
		for(int i = 1; i <= a; i++) {
			num *= i;
		}
		
		bw.write((num/604800) + "");
		bw.flush();
		br.close();
	}
}

		