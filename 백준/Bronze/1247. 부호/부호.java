

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
		
		int out_count = 3;
		
		while(out_count!=0){
			int in_count = Integer.parseInt(br.readLine());
			BigInteger p = new BigInteger("0");
			BigInteger n = new BigInteger("0");
			while(in_count!=0) {
				BigInteger a = new BigInteger(br.readLine());
				n = n.add(a);
				in_count--;
			}
			if(n.compareTo(p) == 0) {
				bw.write("0");
			}else if(n.compareTo(p) == 1) {
				bw.write("+");
			}else if(n.compareTo(p) == -1){
				bw.write("-");
			}
			bw.newLine();
			out_count--;
		}
		
		
		
		bw.flush();
		br.close();
	}
}