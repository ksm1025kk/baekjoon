

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Long count = Long.parseLong(br.readLine());
		while(count!=0) {
			String str1[] = br.readLine().split(" ");
			if(str1[1].equals("+")) {
				if(Long.parseLong(str1[0]) + Long.parseLong(str1[2]) == Long.parseLong(str1[4])) {
					bw.write("correct");
				}else {
					bw.write("wrong answer");
				}
			}else if(str1[1].equals("-")) {
				if(Long.parseLong(str1[0]) - Long.parseLong(str1[2]) == Long.parseLong(str1[4])) {
					bw.write("correct");
				}else {
					bw.write("wrong answer");
				}
			}else if(str1[1].equals("*")) {
				if(Long.parseLong(str1[0]) * Long.parseLong(str1[2]) == Long.parseLong(str1[4])) {
					bw.write("correct");
				}else {
					bw.write("wrong answer");
				}
			}else {
				if(Long.parseLong(str1[0]) / Long.parseLong(str1[2]) == Long.parseLong(str1[4])) {
					bw.write("correct");
				}else {
					bw.write("wrong answer");
				}
			}
			bw.newLine();
			count--;
		}
		
		bw.flush();
		br.close();
	}
}
