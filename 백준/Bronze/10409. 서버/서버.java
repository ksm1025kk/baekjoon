

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		String str2[] = br.readLine().split(" ");
		int count = 0;
		for(int i = 0; i < a; i++) {
			b -= Integer.parseInt(str2[i]);
			if(b<0) {
				break;
			}else {
				count++;
			}
		}
		bw.write("" + count);
		bw.flush();
		br.close();

	}
}
