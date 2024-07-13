

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		while (num != 0) {
			String s[] = br.readLine().split(" ");
			int m = Integer.parseInt(s[0]);
			int n = Integer.parseInt(s[1]);

			int count = 0;
			int box[][] = new int[m][n];

			for (int i = 0; i < m; i++) {
				s = br.readLine().split(" ");
				for (int j = 0; j < n; j++) {
					box[i][j] = Integer.parseInt(s[j]);
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (box[j][i] == 1) {
						for (int k = j+1; k < m; k++) {
							if(box[k][i] == 0) {
								count++;
							}
						}
					}
				}
			}
			bw.write(count + "");
			bw.newLine();
			num--;
		}

		bw.flush();
		bw.close();
	}
}
