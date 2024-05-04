

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t!=0) {
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i <n; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(arr);
			int res = arr[n-1] - arr[0];
			bw.write((2*res) + "");
			bw.newLine();
			t--;
		}

		bw.flush();
		br.close();
	}
}
