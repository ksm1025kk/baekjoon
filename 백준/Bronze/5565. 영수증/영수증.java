import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int hap = Integer.parseInt(br.readLine());
			int count = 9;
			int pur = 0;
			while(count != 0) {
				int a = Integer.parseInt(br.readLine());
				pur += a;
				count--;
			}
			bw.write("" + (hap-pur));
			bw.flush();
			br.close();
					
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}