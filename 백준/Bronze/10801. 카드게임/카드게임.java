

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 10;
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int a = 0; 
		int b = 0;
		String str1[] = br.readLine().split(" ");
		String str2[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(str1[i]);
			arr2[i] = Integer.parseInt(str2[i]);	
			if(arr1[i]>arr2[i]) {
				a++;
			}else if(arr1[i]<arr2[i]) {
				b++;
			}
		}
		if(a>b) {
			bw.write("A");
		}else if(a<b) {
			bw.write("B");
		}else {
			bw.write("D");
		}
		bw.flush();
		br.close();
	}
}
