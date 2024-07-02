

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 1;
		while (true) {
			String str1[] = br.readLine().split(" ");
			if (str1[1].equals("E")) {
				break;
			}
			int a = Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[2]);
			
			switch (str1[1]) {
				case ">": {
					if (a > b) {
						bw.write("Case " + count + ": true");
					} else {
						bw.write("Case " + count + ": false");
					}
					break;
				}
				case ">=": {
					if (a >= b) {
						bw.write("Case " + count + ": true");
					} else {
						bw.write("Case " + count + ": false");
					}	
					break;
				}
				case "<": {
					if (a < b) {
						bw.write("Case " + count + ": true");
					} else {
						bw.write("Case " + count + ": false");
					}
					break;
				}
				case "<=": {
					if (a <= b) {
						bw.write("Case " + count + ": true");
					} else {
						bw.write("Case " + count + ": false");
					}
					break;
				}
				case "==": {
					if (a == b) {
						bw.write("Case " + count + ": true");
					} else {
						bw.write("Case " + count + ": false");
					}
					break;
				}
				case "!=": {
					if (a != b) {
						bw.write("Case " + count + ": true");
					} else {
						bw.write("Case " + count + ": false");
					}
					break;
				}
			}
			count++;
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}
