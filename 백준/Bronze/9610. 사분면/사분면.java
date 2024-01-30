

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int AXIS = 0;
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			if(a == 0||b == 0) {
				AXIS++;
			}
			if(a>0) {
				if(b>0) {
					one++;
				}else if(b<0) {
					four++;
				}
			}else if(a<0) {
				if(b>0) {
					two++;
				}else if(b<0) {
					three++;
				}
			}
			count--;
		}
		
		bw.write("Q1: " + one);
		bw.newLine();
		bw.write("Q2: " + two);
		bw.newLine();
		bw.write("Q3: " + three);
		bw.newLine();
		bw.write("Q4: " + four);
		bw.newLine();
		bw.write("AXIS: " + AXIS);
		bw.flush();
		br.close();
	}
}
