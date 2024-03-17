

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
		int n1 = Integer.parseInt(str[0]);
		int n2 = Integer.parseInt(str[1]);
		
		int a = 100-n1;
		int b = 100-n2;
		int c = 100-(a+b);
		int d = a*b;
		int q = d/100;
		int r = d%100;
		
		
		bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r);
		bw.newLine();
		bw.write((c+q) + " " + r);
	
		bw.flush();
		br.close();
	}
}

		