

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int ch = 100;
		int sa = 100;
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);	
			
			if(a>b) {
				sa -= a;
			}else if(a<b) {
				ch -= b;
			}
			count--;
		}
		bw.write(ch + "");
		bw.newLine();
		bw.write(sa + "");
		bw.flush();
		br.close();
	}
}
