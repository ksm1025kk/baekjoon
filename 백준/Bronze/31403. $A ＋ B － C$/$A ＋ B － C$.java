

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		int add = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
		String ab = a + b;
		int abc = Integer.parseInt(ab) - Integer.parseInt(c);
		bw.write(add + "");
		bw.newLine();
		bw.write(abc + "");
		bw.flush();
		br.close();
	}
}

		