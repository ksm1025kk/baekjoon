

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {

			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int max = 0;
			int min = 0;
			int j = 1;
			
			while(true) {
				if(a % j == 0 && b % j == 0) {
					min = j;
				}
				if(j % a == 0 && j % b == 0) {
					max = j;
					break;
				}
				j++;
			}
			bw.write(max + " " + min);
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
