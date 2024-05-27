

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int k = 0;
		int j = 0;
		while(n!=0) {
			String str = br.readLine();
			if(str.equals("0")) {
				j++;
			}else if(str.equals("1")) {
				k++;
			}
			n--;
		}
		if(k>j) {
			bw.write("Junhee is cute!");
		}else {
			bw.write("Junhee is not cute!");
		}
		bw.flush();
		br.close();
	}
}
