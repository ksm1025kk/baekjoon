

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		char S1[] = {'E','S','T','J'};
		char S2[] = {'I','N','F','P'};
		
		for(int i = 0; i < 4; i++) {
			if(a.charAt(i)==S1[i]) {
				bw.write(S2[i]);
			}else if(a.charAt(i) == S2[i]) {
				bw.write(S1[i]);
			}
		}
		
		bw.flush();
		br.close();
	}
}
