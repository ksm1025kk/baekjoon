

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static int n1, m;
	static int arr[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n1 = Integer.parseInt(br.readLine());
		String str1[] = br.readLine().split(" ");
		arr = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr[i] = Integer.parseInt(str1[i]);
		}
		Arrays.sort(arr);

		int n2 = Integer.parseInt(br.readLine());
		String str2[] = br.readLine().split(" ");
		for (int i = 0; i < n2; i++) {
			int num = Integer.parseInt(str2[i]);
			bw.write(bs(num) + " ");
		}
		bw.flush();
		br.close();
	}

	public static int bs(int num) {
		int left = 0;
		int right = n1 - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			int midvalue = arr[mid];
			if (num > midvalue) {
				left = mid + 1;
			} else if (num < midvalue) {
				right = mid - 1;
			} else {
				return 1;
			}
		}
		return 0;
	}
}
