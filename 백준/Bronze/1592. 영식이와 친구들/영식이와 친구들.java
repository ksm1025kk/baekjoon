

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int l = Integer.parseInt(str[2]);
		int arr[] = new int[n];
		int answer = 0;
		int temp = 0;
		while(true) {
			if(arr[temp] % 2 == 1) {
				temp = (temp + l) % n;
				arr[temp]++;
				answer++;
			}
			else if(arr[temp] % 2 == 0) {
				temp = ((temp - l) + n) % n;
				arr[temp]++;
				answer++;
			}
			if(arr[temp] == m)
				break;
		}
		bw.write((answer-1) + "");
		bw.flush();
		br.close();
	}
}
