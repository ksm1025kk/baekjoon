

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		
		Long arr[] = new Long[a];
		for(int i = 0; i < a; i++) {
			arr[i] = Long.parseLong(str[i]);
		}
		Arrays.sort(arr);
		bw.write((arr[a-1]-arr[0]) + "");
		bw.flush();
		br.close();
	}
}
