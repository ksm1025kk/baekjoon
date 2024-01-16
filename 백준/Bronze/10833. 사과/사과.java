

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int res = 0;
		if(count == 1) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			if(a>b) {
				res = b;
			}
			else {
				res += b%a;
			}
			bw.write(res + "");
			
		}else {
			while(count!=0) {
				String str[] = br.readLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				if(a>b) {
					res += b;
				}
				else {
					res += b%a;
				}
				count--;
			}
			bw.write("" + res);
		}
		
		bw.flush();
		br.close();
	}
}
