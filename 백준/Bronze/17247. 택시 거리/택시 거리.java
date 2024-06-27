

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str1[] = br.readLine().split(" ");
		int x = Integer.parseInt(str1[0]);
		int y = Integer.parseInt(str1[1]);
		
		int count = 0;
		int a1 = 0;
		int b1 = 0;
		int a2 = 0;
		int b2 = 0;
		
		for(int i = 0; i < x; i++) {
			String str[] = br.readLine().split(" ");
			for(int j = 0; j < y; j++) {
				if(str[j].equals("1") && count == 0) {
					a1 = i+1;
					b1 = j+1;
					count++;
				}else if(str[j].equals("1") && count == 1) {
					a2 = i+1;
					b2 = j+1;
				}
			}
		}
		
		int d1 = (a2-a1);
		int d2 = (b2-b1);
		if(d1<0) {
			d1 *= -1;
		}
		if(d2<0) {
			d2 *= -1;
		}
		int d = d1 + d2;
		bw.write(d + "");
		bw.flush();
		br.close();
	}
}
