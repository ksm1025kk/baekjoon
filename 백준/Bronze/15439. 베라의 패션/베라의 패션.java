

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int n1[] = new int[n+1];
		int n2[] = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			n1[i] = i;
			n2[i] = i;
		}
		int count = 0;
		for(int i = 1; i < n+1; i++) {
			for(int j = 1; j < n+1; j++) {
				if(n1[i]!=n2[j]) {
					count++;
				}
			}
		}
		bw.write(count + "");
		bw.flush();
		br.close();
	}
}

		