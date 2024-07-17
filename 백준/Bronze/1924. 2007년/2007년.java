

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int mons[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String days[] = {"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};
		
		String str[] = br.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int d = Integer.parseInt(str[1]);
		int n = 0;
		
		for (int i = 0; i < m; i++) {
            n += mons[i];
        }
		n += d-1;
		bw.write("" + days[n%7]);
		bw.flush();
		br.close();
	}
}
