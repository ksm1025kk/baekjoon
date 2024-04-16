

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int t = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int p = Integer.parseInt(str[3]);
		
		int n1 = n/t;
		int n2 = n%t;
		if(n2<=0) {
			n1--;
		}
		
		bw.write("" + (n1*c*p));
		bw.flush();
		br.close();
	}
}
