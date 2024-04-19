

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0 0 0")) {
				break;
			}
			String word[] = str.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			int c = Integer.parseInt(word[2]);
			int d = Integer.parseInt(word[3]);
			bw.write((c-b) + " ");
			bw.write((d-a) + "");
			bw.newLine();
		}
		
		bw.flush();
		br.close();
	}
}
