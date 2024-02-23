

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
		String str[] = br.readLine().split(" ");
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		if(b>a) {
			bw.write((b-a-1) + "");
			bw.newLine();
			for(long i = a+1; i<b; i++) {
				bw.write(i + " ");
			}
		}
		else if(a>b) {
			bw.write((a-b-1) + "");
			bw.newLine();
			for(long i = b+1; i<a; i++) {
				bw.write(i + " ");
			}
		}else {
			bw.write("0");
		}
		bw.flush();
		br.close();
	}

}