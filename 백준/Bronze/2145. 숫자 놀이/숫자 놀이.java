import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String a = br.readLine();
			if (a.equals("0")) {
				break;
			}
			
			boolean b = true;
			
			while(b) {
				String str[] = a.split("");
				int num = 0;
				for (int i = 0; i < str.length; i++) {
					num += Integer.parseInt(str[i]);
				}
				if (num / 10 == 0) {
					bw.write(num + "");
					bw.newLine();
					b = false;	
				} else {
					a = Integer.toString(num);
				}
			}
		}
		bw.flush();
		br.close();
	}
}