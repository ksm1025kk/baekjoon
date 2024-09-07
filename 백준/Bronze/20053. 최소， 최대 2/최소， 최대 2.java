
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t-- != 0) {
			int n = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(arr);
			bw.write(arr[0] + " " + arr[arr.length-1]);
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
