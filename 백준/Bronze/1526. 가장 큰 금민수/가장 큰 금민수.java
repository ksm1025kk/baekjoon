

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = br.readLine();
		while (true) {
			boolean check = true;
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i) != '4' && n.charAt(i) != '7') {
					check = false;
					break;
				}
			}
			if(check == true) {
				break;
			}else{
				n = String.valueOf(Integer.parseInt(n)-1);
			}
		}
		bw.write(n);
		bw.flush();
		bw.close();
	}
}
