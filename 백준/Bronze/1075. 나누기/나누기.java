

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = br.readLine();
		int f = Integer.parseInt(br.readLine());
		
		String nn = n.substring(0, n.length()-2);
		String res = "";
		outerLoop:
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				String nnn = nn;
				
				nnn += (Integer.toString(i) + Integer.toString(j));
				if(Integer.parseInt(nnn) % f == 0) {
					res += (Integer.toString(i) + Integer.toString(j));
					break outerLoop;
				}
			}
		}
		bw.write(res);
		bw.flush();
		br.close();
	}
}
