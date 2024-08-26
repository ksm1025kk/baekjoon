

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int now = 0;
		int start = 0;
		String str1[] = br.readLine().split(":");
		int h = Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str1[1]);
		int s = Integer.parseInt(str1[2]);
		now = (h * 3600) + (m * 60) + s;
		String str2[] = br.readLine().split(":");
		h = Integer.parseInt(str2[0]);
		m = Integer.parseInt(str2[1]);
		s = Integer.parseInt(str2[2]);
		start = (h * 3600) + (m * 60) + s;
		int time = 0;
		if (start > now) {
			time = start - now;
		} else {
			time = (24 * 3600) - (now - start);
		}
		bw.write(String.format("%02d:%02d:%02d", (time / 3600), ((time / 60) % 60), (time % 60)));
		bw.flush();
		br.close();
	}
}
