

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[3];
		while (true) {
			String str = br.readLine();
			if (str.equals("0 0 0")) {
				break;
			}
			String str2[] = str.split(" ");
			arr[0] = Integer.parseInt(str2[0]);
			arr[1] = Integer.parseInt(str2[1]);
			arr[2] = Integer.parseInt(str2[2]);
			Arrays.sort(arr);

			if (arr[2] >= arr[0] + arr[1]) {
				bw.write("Invalid");
			} else if (arr[0] == arr[1] && arr[1] == arr[2]) {
				bw.write("Equilateral");
			} else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				bw.write("Isosceles");
			} else {
				bw.write("Scalene");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
