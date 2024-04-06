

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);
		
		int arr[] = new int[n+1];
		int arr2[] = new int[n+1];
		for(int i = 1; i < n+1; i++) {
			if(i<=m) {
				arr[i] = 0;				
			}else {
				arr[i] = 1;			
			}
		}
		for(int i = 1; i < n+1; i++) {
			if(i<=k) {
				arr2[i] = 0;				
			}else {
				arr2[i] = 1;			
			}
		}
		int count = 0;
		for(int i = 1; i < n+1; i++) {
			if(arr[i] == arr2[i]) {
				count++;
			}
		}
		bw.write(count + "");
		bw.flush();
		br.close();
	}
}

		