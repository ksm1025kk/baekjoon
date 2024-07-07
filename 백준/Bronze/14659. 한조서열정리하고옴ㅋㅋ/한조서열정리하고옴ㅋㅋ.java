

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int answer = Integer.MIN_VALUE;
		for (int i = 0; i < num; i++) {
			int count = 0;
			int h = arr[i];
			for (int j = i + 1; j < num; j++) {
				if (h < arr[j]) {
					break;
				} else {
					count++;
				}
			}
			answer = Math.max(answer, count);
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
