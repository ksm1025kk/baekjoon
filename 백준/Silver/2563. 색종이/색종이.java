

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[][] = new int [100][100];
		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			for(int j = a; j < a+10; j++) {
				for(int k = b; k<b+10; k++) {
					arr[k][j] = 1;
				}
			}
		}
		int res = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j<100; j++) {
				if(arr[i][j] == 1) {
					res += arr[i][j];
				}
			}
		}
		bw.write("" + res);
		bw.flush();
		br.close();
	}

}