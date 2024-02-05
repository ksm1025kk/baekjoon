

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = 10;
		int arr[] = new int[count];
		int start = 0;
		int ss = 0;
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			arr[ss] = start-a+b;
			start = arr[ss];
			ss++;
			count--;
		}
		Arrays.sort(arr);
		bw.write("" + arr[9]);
		bw.flush();
		br.close();
	}
}
