

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int people = Integer.parseInt(br.readLine());
		int arr[][] = new int[people][3];
		int person[] = new int[people];
		for (int i = 0; i < people; i++) {
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < people; j++) {
				for (int k = 0; k < people; k++) {
					if (j == k) {
						continue;
					}
					if (arr[j][i] != arr[k][i]) {
						sum = arr[j][i];
					} else {
						sum = 0;
						break;
					}
				}
				person[j] += sum;
				sum = 0;
			}
		}

		for (int i = 0; i < people; i++) {
			bw.write(person[i] + "");
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
