import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int a = Integer.parseInt(br.readLine());
			int arr[] = new int[a + 1];
			arr[0] = 0;
			arr[1] = 1;
			for (int i = 2; i <= a; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
			bw.write(arr[a] + "");
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
