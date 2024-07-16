

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int num = Integer.parseInt(str[0]);
		int count = Integer.parseInt(str[1]);
		
		int arr[] = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = num * (i + 1);
		}
		
		int arr2[] = new int[count];
		for(int i = 0; i < count; i++) {
			StringBuilder sb = new StringBuilder(Integer.toString(arr[i]));
			arr2[i] = Integer.parseInt(sb.reverse().toString());
		}
		Arrays.sort(arr2);
		bw.write(arr2[count-1] + "");
		bw.flush();
		br.close();
	}
}
