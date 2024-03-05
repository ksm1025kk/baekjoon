

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[6];
		for(int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int apple = arr[0]*3 + arr[1]*2 + arr[2];
		int banana = arr[3]*3 + arr[4]*2 + arr[5];
		
		if(apple>banana) {
			bw.write("A");
		}else if(apple<banana) {
			bw.write("B");
		}else {
			bw.write("T");
		}
		bw.flush();
		br.close();
	}

}