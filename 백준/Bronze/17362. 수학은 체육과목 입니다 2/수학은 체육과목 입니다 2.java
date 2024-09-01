

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		if(n % 8 == 0) {
			bw.write(2 + "");
		}else if(n % 4 == 3) {
			bw.write(3 + "");
		}else if(n % 8 == 6) {
			bw.write(4 + "");
		}else {
			bw.write((n % 8) + "");
		}
		bw.flush();
		br.close();
	}
}
