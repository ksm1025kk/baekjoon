

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int res = 0;
		int count = str.length();
		for(int i = 0; i < count; i++) {
			switch(str.charAt(i)) {
			case 'A' : case 'B': case 'C':
				res+=3;
				break;
			case 'D' : case 'E': case 'F':
				res+=4;
				break;
			case 'G' : case 'H': case 'I':
				res+=5;
				break;
			case 'J' : case 'K': case 'L':
				res+=6;
				break;
			case 'M' : case 'N': case 'O':
				res+=7;
				break;
			case 'P' : case 'Q': case 'R': case 'S':
				res+=8;
				break;
			case 'T' : case 'U': case 'V':
				res+=9;
				break;
			case 'W' : case 'X': case 'Y': case 'Z':
				res+=10;
				break;
				
			}
		}
		bw.write("" + res);
		bw.flush();
		br.close();
	}

}