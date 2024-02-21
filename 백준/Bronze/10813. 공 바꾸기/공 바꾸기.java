

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
		int array = Integer.parseInt(str[0]);
		int count = Integer.parseInt(str[1]);
		int arr[] = new int[(array+1)];
		for(int i = 1 ; i < arr.length; i++) {
			arr[i] = i;
		}
		
		while(count!=0) {
			String word[] = br.readLine().split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			int c = 0;
			c = arr[a];
			arr[a] = arr[b];
			arr[b] = c;
			
			count--;
		}
		for(int i = 1; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		br.close();
	}

}