

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int crap = 0;
		for(int i = 1; i <= count; i++) {
			String str[] = Integer.toString(i).split("");
			for(String j:str) {
				if(j.equals("3")) {
					crap++;
				}
				else if(j.equals("6")) {
					crap++;
				}
				else if(j.equals("9")) {
					crap++;
				}
				
			}
		}
		bw.write("" + crap);
		bw.flush();
		br.close();
	}
}
