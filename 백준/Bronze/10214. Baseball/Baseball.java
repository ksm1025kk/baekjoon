

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

		int a = Integer.parseInt(br.readLine());
		while(a!=0) {
			int y = 0; 
			int k = 0;
			int b = 9;
			while(b!=0) {
				String str[] = br.readLine().split(" ");
				y += Integer.parseInt(str[0]);
				k += Integer.parseInt(str[1]);
				b--;
			}
			if(y>k) {
				bw.write("Yonsei");
			}else if(y<k) {
				bw.write("Korea");
			}else {
				bw.write("Draw");
			}
			bw.newLine();;
			a--;
		}
		bw.flush();
		br.close();
	}

}