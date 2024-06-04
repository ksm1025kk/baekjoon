

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int y1 = Integer.parseInt(str[0]);
		int m1 = Integer.parseInt(str[1]);
		int d1 = Integer.parseInt(str[2]);
		String str2[] = br.readLine().split(" ");
		int y2 = Integer.parseInt(str2[0]);
		int m2 = Integer.parseInt(str2[1]);
		int d2 = Integer.parseInt(str2[2]);
		
		int age = y2 - y1;
		
		if(y1 == y2) {
			bw.write(age + "");
		}else{
			if(m1 > m2) {
				bw.write((age - 1) + "");
			}else if(m1 == m2){
				if(d1 <= d2) {
					bw.write(age + "");
				}else {
					bw.write((age - 1) + "");
				}
			}else{
				bw.write(age + "");
			}
		}
		bw.newLine();
		bw.write((age + 1) + "");
		bw.newLine();
		bw.write(age + "");
		bw.flush();
		br.close();
	}
}
