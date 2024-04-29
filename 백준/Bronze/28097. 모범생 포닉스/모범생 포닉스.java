

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int count = -8;
		for(int i = 0; i < str.length; i++) {
			count += (Integer.parseInt(str[i]) + 8);
		}
		bw.write((count/24) + " " + (count%24));
		bw.flush();
		br.close();
	}
}
