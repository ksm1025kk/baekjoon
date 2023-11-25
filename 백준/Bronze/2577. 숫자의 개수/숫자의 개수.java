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
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());

			int res = a * b * c;
			int arr[] = new int[10];
			String restr[] = Integer.toString(res).split("");
			for (int i = 0; i < restr.length; i++) {
				for (int j = 0; j < 10; j++) {
					if (restr[i].equals(Integer.toString(j))) {
						arr[j] += 1;
					}
				}
			}
			for(int i : arr) {
				bw.write("" + i);
				bw.newLine();
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
