

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String str[] = br.readLine().split(" ");
		int count = Integer.parseInt(str[0]);
		int a = Integer.parseInt(str[1]);
		int b = Integer.parseInt(str[2]);
		while(count!=0) {
			int num = Integer.parseInt(br.readLine());
			if(num<=a || num <= b || (num*num)<=(a*a) + (b*b)) {
				bw.write("DA");
			}else {
				bw.write("NE");
			}
			count--;
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
