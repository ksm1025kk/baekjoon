
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while (count-- != 0) {
			int num = 0;
			int sum = 0;
			String str[] = br.readLine().split("");
			for(int i = 0; i < str.length; i++) {
				if(str[i].equals("O")) {
					num++;
				}else {
					num = 0;
				}
				sum += num;
			}
			bw.write("" + sum);
			bw.newLine();
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
