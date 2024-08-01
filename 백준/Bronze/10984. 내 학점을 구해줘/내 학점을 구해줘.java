

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
			int n = Integer.parseInt(br.readLine());
			int hap = 0;
			double gpa = 0;
			while (n-- != 0) {
				String str[] = br.readLine().split(" ");
				int s = Integer.parseInt(str[0]);
				double r = Double.parseDouble(str[1]);
				hap += s;
				gpa += (r*s);
			}
			double res = gpa / hap;
			bw.write(hap + " " + String.format("%.1f", res));
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
