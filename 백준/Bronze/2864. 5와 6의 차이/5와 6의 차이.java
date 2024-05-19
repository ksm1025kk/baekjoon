

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str [] = br.readLine().split(" ");
		String a = str[0];
		String b = str[1];
		String maxA = "";
		String maxB = "";
		String minA = "";
		String minB = "";
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '5' || a.charAt(i) == '6') {
				minA += "5";
				maxA += "6";
				
			}else {
				minA += a.charAt(i);
				maxA +=	a.charAt(i);
			}
		}
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == '5' || b.charAt(i) == '6') {
				minB += "5";
				maxB += "6";
				
			}else {
				minB += b.charAt(i);
				maxB +=	b.charAt(i);
			}
		}
		
		int max = Integer.parseInt(minA) + Integer.parseInt(minB);
		int min = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		bw.write(max + " " + min);
		bw.flush();
		br.close();
	}
}
