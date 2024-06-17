

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String arr1[] = { "A+", "A0", "A-", "B+", "B0", "B-", "C+",
				"C0", "C-", "D+", "D0", "D-", "F"};
		double arr2[] = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 
				2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
		int a = Integer.parseInt(br.readLine());
		double res = 0.0;
		int b = 0;
		while(a!=0){
			String str[] = br.readLine().split(" ");
			for(int i = 0; i < arr1.length; i++) {
				if(str[str.length-1].equals(arr1[i])) {
					res += (Integer.parseInt(str[str.length-2]) * arr2[i]);
				}
			}
			b += Integer.parseInt(str[str.length-2]);
			a--;
		}
		
		bw.write(String.format("%.2f", res / b));
		bw.flush();
		br.close();
	}
}
