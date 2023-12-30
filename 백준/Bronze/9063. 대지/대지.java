import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int maxx = -1000;
		int minx = 1000;
		int maxy = -1000;
		int miny = 1000;
		while (count != 0) {
			String str[] = br.readLine().split(" ");
			maxx = Math.max(maxx, Integer.parseInt(str[0]));
			minx = Math.min(minx, Integer.parseInt(str[0]));
			maxy = Math.max(maxy, Integer.parseInt(str[1]));
			miny = Math.min(miny, Integer.parseInt(str[1]));
			count--;
		}

		int res = ((maxx - minx) * (maxy - miny));
		bw.write("" + res);

		bw.flush();
		br.close();
	}
}