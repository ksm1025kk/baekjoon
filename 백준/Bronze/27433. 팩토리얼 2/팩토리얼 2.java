import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			bw.write("" + factorial(n));
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}