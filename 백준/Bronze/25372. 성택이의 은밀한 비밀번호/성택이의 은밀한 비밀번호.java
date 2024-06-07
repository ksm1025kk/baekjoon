

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		while(a!=0) {
			String str[] = br.readLine().split("");
			if(str.length>=6 && str.length<=9) {
				bw.write("yes");
			}else {
				bw.write("no");
			}
			bw.newLine();
			a--;
		}
		bw.flush();
		br.close();
	}
}
