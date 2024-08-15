

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		int count = 0;
		if(a<0) {
			count += (0-a)*c + d + (b*e);
		}else if(a == 0) {
			count += d + (b*e);
		}else {
			count += (b-a)*e;
		}
		bw.write(count + "");
		bw.flush();
		br.close();
	}
}
