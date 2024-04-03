

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
		Long a = Long.parseLong(str[0]);
		Long b = Long.parseLong(str[1]);
		Long c = Long.parseLong(br.readLine());
		
		if(a+b>=2*c) {
			bw.write((a+b-(2*c))+"");
		}else {
			bw.write((a+b) + "");
		}
		bw.flush();
		br.close();
	}
}

		