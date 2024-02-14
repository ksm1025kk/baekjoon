

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr1[] = new int[10];
		int arr2[] = new int[10];
		int b = 10;
		for(int i = 0; i < 20; i++) {
			if(i>9) {
				arr2[b-i] = Integer.parseInt(br.readLine());
				b+=2;
			}else {
				arr1[i] = Integer.parseInt(br.readLine());
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int a1 = 0;
		int a2 = 0;
		for(int i = 9; i>6; i--) {
			a1 += arr1[i];
			a2 += arr2[i];
		}
		bw.write(a1 + " " + a2);
		bw.flush();
		br.close();
	}
}