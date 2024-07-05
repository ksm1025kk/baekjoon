

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 1; i <= 500; i++) {
			for(int j = 1; j <= 500; j++) {
				if((i*i)-(j*j) == a) {
					count++;
				}
			}
		}
		bw.write("" + count);
		bw.flush();
		bw.close();
	}
}
