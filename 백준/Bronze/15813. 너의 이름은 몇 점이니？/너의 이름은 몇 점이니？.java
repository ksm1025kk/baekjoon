

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int n = 0;
		for(int i = 0; i < str.length(); i++){
			int num = str.charAt(i)-'0';
			n += num;
		}
		n = n-(a*16);
		bw.write(n + "");
		bw.flush();
		br.close();
	}
}
