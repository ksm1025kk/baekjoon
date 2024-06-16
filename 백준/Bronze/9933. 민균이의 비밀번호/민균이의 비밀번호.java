

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String str[] = new String[count];
		for(int i = 0; i < count; i++) {
			str[i] = br.readLine();
		}
		
		String restr = "";
		for(int j = 0; j < count; j++) {
			String word = str[j];
			for(int i = 0; i < count; i++) {
				StringBuilder sb = new StringBuilder(str[i]);
				if(sb.reverse().toString().equals(word)) {
					restr = word;
				}
			}
		}
		bw.write(restr.length() + " " + restr.charAt(restr.length()/2));
		
		bw.flush();
		br.close();
	}
}
