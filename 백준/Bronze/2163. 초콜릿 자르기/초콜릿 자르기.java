

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str [] = br.readLine().split(" ");
		int res = Integer.parseInt(str[1]) * Integer.parseInt(str[0]) - 1;
		bw.write(res + "");
		bw.flush();
		br.close();
	}
}
