

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			int res = 0;
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			for(int i = 1; i <= a; i++) {
				for(int j = 1; j<=b; j++) {
					for(int k = 1; k<=c; k++) {
						if((i%j) == (j%k) && (j%k) ==(k%i)) {
							res++;
						}
					}
				}
			}
			bw.write("" + res);
			bw.newLine();
			count--;
		}
		bw.flush();
		br.close();
	}
}

		