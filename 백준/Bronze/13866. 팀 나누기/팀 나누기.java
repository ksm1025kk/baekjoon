

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int arr[] = new int[4];
		for(int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]); 
		}
		Arrays.sort(arr);
		int n1 = arr[0] + arr[3];
		int n2 = arr[1] + arr[2];
		int n3 = Math.max(n1, n2) - Math.min(n1, n2);
		
		int n4 = arr[0] + arr[2];
		int n5 = arr[1] + arr[3];
		int n6 = Math.max(n4, n5) - Math.min(n4, n5);
		
		bw.write(Math.min(n3, n6) + "");
		bw.flush();
		br.close();
	}
}