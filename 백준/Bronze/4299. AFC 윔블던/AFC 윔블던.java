

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		if((a + b) % 2 != 0 || a < b) {
			bw.write("-1");
		}else {
			bw.write(((a + b) / 2) + " " + (((a + b) / 2) - b));
		}
		bw.flush();
		br.close();
	}
}

		
		