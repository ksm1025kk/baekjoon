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
			double d1 = (double)a;
			double d2 = (double)b;
			
			double f = 3.141592;
			
			bw.write("" + ((2*d1) + (2*d2*f)));
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}