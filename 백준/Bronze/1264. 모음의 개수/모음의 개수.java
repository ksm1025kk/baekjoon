import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while (true) {
			String str = br.readLine();
			if (str.equals("#"))
				break;
			str = str.toLowerCase();
			int ans = 0;
			
			for (int i = 0; i < str.length(); i++) {
				char t = str.charAt(i);
				if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u')
					ans++;
			}
			bw.write("" + ans);
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}