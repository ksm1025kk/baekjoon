

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			int res = 0;
			String str1[] = br.readLine().split("");
			String str2[] = br.readLine().split("");
			for(int i = 0; i < str1.length; i++) {
				if(!str1[i].equals(str2[i])) {
					res++;
				}
			}
			bw.write("Hamming distance is " + res + ".");
			bw.newLine();
			count--;
		}
		
		bw.flush();
		br.close();
	}
}
