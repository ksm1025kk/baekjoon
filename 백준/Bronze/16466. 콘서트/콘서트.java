

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int arr[] = new int[count];
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		int cnt = 0;
		for(int i=0;i<count;i++) {
			if (arr[i]!=i+1) {
				System.out.println(i+1);
				cnt ++ ;
				break;
			}
		}
		if (cnt == 0) {
			System.out.println(count+1);
		}
		bw.flush();
		br.close();
	}
}
