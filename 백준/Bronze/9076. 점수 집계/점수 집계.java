

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
		
		while(a != 0) {
			int arr[] = new int[5];
			String str[] = br.readLine().split(" ");
			for(int i = 0; i < str.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(arr);
			if(arr[3]-arr[1]>=4) {
				bw.write("KIN");
			}else {
				bw.write(arr[1] + arr[2] + arr[3] + "");
			}
			bw.newLine();
			a--;
		}
		bw.flush();
		br.close();
	}
}

