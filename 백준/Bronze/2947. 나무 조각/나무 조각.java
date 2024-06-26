

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[str.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = Integer.parseInt(str[i]);
		}
		while (true) {
			int count = 0;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					count++;
				}
			}
			if (count == 5) {
				break;
			}

			for (int i = 0; i < arr1.length - 1; i++) {
				int c = 0;
				if (arr2[i] > arr2[i + 1]) {
					int n = arr2[i];
					arr2[i] = arr2[i + 1];
					arr2[i + 1] = n;
					c++;
				}
				if (c == 1) {
					for (int j = 0; j < arr1.length; j++) {
						bw.write(arr2[j] + " ");
					}
					bw.newLine();
				}

			}

		}

		bw.flush();
		br.close();
	}
}
