

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		while(n!=0) {
			String str[] = br.readLine().split(" ");
			String word = "";
			for(int i = 2; i < str.length; i++) {
				word += str[i] + " ";
			}
			word = word + str[0] + " " + str[1];
			bw.write(word);
			bw.newLine();
			n--;
		}
		bw.flush();
		br.close();
	}
}
