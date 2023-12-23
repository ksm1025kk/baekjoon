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
			int b = 1;
			while(a != 0) {
				String str = br.readLine();
				bw.write(b + ". " + str);
				bw.newLine();
				b++;
				a--;
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}