

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int size = Integer.parseInt(str[0]);
		int count = Integer.parseInt(str[1]);
		int arr[] = new int[size];
		while(count!=0) {
			String str2[] = br.readLine().split(" ");
			int start = Integer.parseInt(str2[0])-1;
			int end = Integer.parseInt(str2[1])-1;
			int ball = Integer.parseInt(str2[2]);
			for(int i = start; i <= end; i++) {
				arr[i] = ball;
			}
			count--;
		}
		for(int i  = 0; i < size; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		br.close();
	}
}
