

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String count[] = br.readLine().split(" ");
		int a = Integer.parseInt(count[0]);
		int b = Integer.parseInt(count[1]);
		
		String str1[] = br.readLine().split(" ");
		String str2[] = br.readLine().split(" ");
		long max = Long.parseLong(str1[0])+Long.parseLong(str2[0]);
		for(int i = 0; i < a; i++) {
			for(int j = 0; j<b; j++) {
				long num = Long.parseLong(str1[i])+Long.parseLong(str2[j]);
				if(num>max) {
					max = num;
				}
			}
		}
		bw.write(max + "");
		bw.flush();
		br.close();
	}
}

		