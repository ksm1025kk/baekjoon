

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
		int c = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		int p = Integer.parseInt(str[2]);
		int add = 0;
		for(int i = 1; i<=c; i++) {
			int count = (k*i)+(p*(i*i));
			add += count;
		}
		bw.write(add + "");
		bw.flush();
		br.close();
	}
}

		