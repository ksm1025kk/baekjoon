

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double num = Double.parseDouble(br.readLine());
		while(true) {
			double n = Double.parseDouble(br.readLine());
			if(n == 999) {
				break;
			}
			bw.write(String.format("%.2f", (n-num)));
			num = n;
			bw.newLine();
		}
		
		bw.flush();
		br.close();
	}
}

		