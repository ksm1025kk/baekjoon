

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			int h = 0;
			int w = 0;
			int hw = 0;
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(c%a == 0) {
				h = a*100;
				w = c/a;
			}else {
				h = c%a*100;
				w = c/a+1;
			}
			hw = h+w;
			bw.write("" + hw);
			bw.newLine();
		
			count--;
		}
		bw.flush();
		br.close();
	}
}
