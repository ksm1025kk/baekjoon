

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int res = 0;
		for(int i = 0; i < count; i++) {
			if(Integer.parseInt(str[i]) != i+1) {
				res++;
			}
		}
		bw.write("" + res);
		bw.flush();
		br.close();
	}
}
