

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int count = a * 5;
		
		for(int i = 0; i < count; i++) {
			if(i>=count-a) {
				for(int j = 0; j < count; j++) {
					bw.write("@");
				}
			}else {
				for(int j = 0; j < a; j++) {
					bw.write("@");
				}
			}
			bw.newLine();
		}
		
		bw.flush();
		br.close();
	}
}
