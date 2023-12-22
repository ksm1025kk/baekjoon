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
			int a = (Integer.parseInt(str[1])/Integer.parseInt(str[3]));
			int b = (Integer.parseInt(str[2])/Integer.parseInt(str[3]));
			bw.write("" + Math.min((a*b), Integer.parseInt(str[0])));
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}