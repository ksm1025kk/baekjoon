

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
		int count = Integer.parseInt(br.readLine());
		int num = 0;
		while(count!=0) {
			
			String b = br.readLine();
			if(b.equals(a)) {
				num++;
			}
			count--;
		}
		bw.write(num + "");
		bw.flush();
		br.close();
	}
}

		