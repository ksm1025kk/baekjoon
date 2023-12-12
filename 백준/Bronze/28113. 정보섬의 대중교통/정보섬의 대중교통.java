import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String str[] = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int A = Integer.parseInt(str[1]);
			int B = Integer.parseInt(str[2]);

			if (B > A) {
				// 버스 타는게 덜 걸림
				bw.write("Bus");
			} else if (B < A) {
				bw.write("Subway");
			} else {
				bw.write("Anything");
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}