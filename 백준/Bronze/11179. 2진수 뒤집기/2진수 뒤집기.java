

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int str = Integer.parseInt(br.readLine());
		String word = Integer.toBinaryString(str);
		StringBuilder sb = new StringBuilder(word);
		String nword = sb.reverse().toString();
		int res = Integer.parseInt(nword, 2);
		bw.write(res + "");
		bw.flush();
		br.close();
	}
}
