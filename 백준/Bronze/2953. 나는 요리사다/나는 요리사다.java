import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int arr[] = new int[5];
			int count = 5;
			int index = 0;
			while (count != 0) {
				String str[] = br.readLine().split(" ");
				for (int i = 0; i < 4; i++) {
					arr[index] += Integer.parseInt(str[i]);
				}
				count--;
				index++;
			}

			int max = arr[0];
			int maxindex = 0;
			for (int i = 0; i < 5; i++) {
				if (max <= arr[i]) {
					max = arr[i];
					maxindex = i + 1;
				}
			}
			bw.write(maxindex + " " + max);
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}