
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int a1 = Integer.parseInt(str[0]);
		int b1 = Integer.parseInt(str[1]);
		String str2[] = br.readLine().split(" ");
		int a2 = Integer.parseInt(str2[0]);
		int b2 = Integer.parseInt(str2[1]);

		bw.write(Math.min(a1 + b2, a2 + b1) + "");
		bw.flush();
		br.close();
	}
}
