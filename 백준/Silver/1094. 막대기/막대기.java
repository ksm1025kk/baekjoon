

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int stick = 64;
		int temp = 0;
		int count = 0;
		int result = num;
		while(true) {
			if(num == 64) {
				count++;
				break;
				
			}
			stick /= 2;
			if(stick <= num) {
				temp += stick;
				count++;
				if(result == temp) {
					break;
					
				}
				num -= stick;
			}
		}
		bw.write(count + "");
		bw.flush();
		br.close();
	}
}
