

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[26];
		for(int i = 0; i < 26; i++) {
			arr[i] = -1;
		}
		String str = br.readLine();
		for(int i = 0; i< str.length(); i++) {
			char a = str.charAt(i);
			if(arr[a - 'a'] == -1) {
				arr[a-'a'] = i;
			}
		}
		for(int i:arr) {
			bw.write(i + " ");
		}
		bw.flush();
		br.close();
	}

}