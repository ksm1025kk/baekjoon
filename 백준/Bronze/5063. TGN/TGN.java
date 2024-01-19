

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		while(a!=0) {
			String str[] = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int e = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(r+c>e) {
				bw.write("do not advertise");
			}else if(r+c == e) {
				bw.write("does not matter");
			}else {
				bw.write("advertise");
			}
			bw.newLine();
			a--;
		}
		
		bw.flush();
		br.close();
	}
}
