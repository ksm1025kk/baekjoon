

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
		
		int count = Integer.parseInt(br.readLine());
		int p1 = 0;
		int p2 = 0;
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			BigInteger a = new BigInteger(str[0]);
			BigInteger b = new BigInteger(str[1]);
			if(a.compareTo(b) == 1) {
				p1++;
			}else if(a.compareTo(b) == -1) {
				p2++;
			}
			count--;
		}
		bw.write(p1 + " " + p2);
		bw.flush();
		br.close();
	}
}