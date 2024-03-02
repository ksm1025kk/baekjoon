

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		while (a != 0) {
			int b = Integer.parseInt(br.readLine());
			int arr[] = new int[b];
			for (int i = 0; i < b; i++) {
				if ((i+1) % 2 == 0) {
					arr[i] = 0;
				} else {
					arr[i] = 1;
				}

			}

			for (int i = 3; i <= b; i++) {
				for (int j = 0; j < b; j++) {
					if ((j+1) % i == 0) {
						if (arr[j] == 1) {
							arr[j] = 0;
						} else {
							arr[j] = 1;
						}

					}
				}
			}
			int re = 0;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] == 1){
					re++;
				}
			}
			bw.write(re + "");
			bw.newLine();
			a--;
		}
		bw.flush();
		br.close();
	}

}