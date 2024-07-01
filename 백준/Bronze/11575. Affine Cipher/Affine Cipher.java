

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			String word = br.readLine();
			for(int i = 0; i < word.length(); i++) {
				int k = word.charAt(i)-'A';
				int ex = (a*k+b)%26;
				bw.write(ex+'A');
			}
			count--;
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
