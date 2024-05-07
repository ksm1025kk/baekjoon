

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t!=0) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			while(n!=0) {
				String str[] = br.readLine().split(" ");
				if(str[0].equals("R") && str[1].equals("P")) {
					count++;
				}else if(str[0].equals("R") && str[1].equals("S")) {
					count--;
				}else if(str[0].equals("P") && str[1].equals("R")) {
					count--;
				}else if(str[0].equals("P") && str[1].equals("S")) {
					count++;
				}else if(str[0].equals("S") && str[1].equals("R")) {
					count++;
				}else if(str[0].equals("S") && str[1].equals("P")) {
					count--;
				}
				n--;
			}
			if(count<0) {
				bw.write("Player 1");
			}else if(count>0) {
				bw.write("Player 2");
			}else {
				bw.write("TIE");
			}
			bw.newLine();
			t--;
		}
		bw.flush();
		br.close();
	}
}
