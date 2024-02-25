

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
		int lenth = Integer.parseInt(str[1]);
		while(count!=0) {
			String str2[] = br.readLine().split("");
			for(int i = (lenth-1); i>=0; i--) {
				bw.write(str2[i]);
			}
			bw.newLine();
			count--;
		}
		bw.flush();
		br.close();
	}

}