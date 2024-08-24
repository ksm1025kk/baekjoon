

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while (count-- != 0) {
			String str = br.readLine();
			int arr[] = new int[8];
			for (int i = 0; i < 38; i++) {
				String st = str.substring(i, i + 3);
				switch (st) {
				case "TTT": {
					arr[0]++;
					break;
				}
				case "TTH": {
					arr[1]++;
					break;
				}
				case "THT": {
					arr[2]++;
					break;
				}
				case "THH": {
					arr[3]++;
					break;
				}
				case "HTT": {
					arr[4]++;
					break;
				}
				case "HTH": {
					arr[5]++;
					break;
				}
				case "HHT": {
					arr[6]++;
					break;
				}
				case "HHH": {
					arr[7]++;
					break;
				}
				}

			}
			for(int i = 0; i < 8; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
