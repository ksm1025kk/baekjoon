

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split("0");
		int left = 0;
		int right = 0;
		for(int i = 0; i < str[0].length(); i++) {
			if(str[0].charAt(i) == '@') {
				left++;
			}
		}
		for(int i = 0; i < str[1].length(); i++) {
			if(str[1].charAt(i) == '@') {
				right++;
			}
		}
		bw.write(left + " " + right);
		bw.flush();
		br.close();
	}
}
