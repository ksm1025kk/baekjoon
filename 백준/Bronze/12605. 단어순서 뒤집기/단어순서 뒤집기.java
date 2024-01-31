

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int cas = 1;
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			String one = "Case #";
			String two = ": ";
			String word = "";
			
			for(int i = str.length-1; i>=0; i--) {
				word += str[i] + " ";
			}
			bw.write(one + cas + two + word);
			bw.newLine();
			cas++;
			count--;
		}
			
		bw.flush();
		br.close();
	}
}
