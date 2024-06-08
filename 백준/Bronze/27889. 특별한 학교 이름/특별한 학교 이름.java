

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();
		if(a.equals("NLCS")) {
			bw.write("North London Collegiate School");
		}else if(a.equals("BHA")) {
			bw.write("Branksome Hall Asia");
		}else if(a.equals("KIS")) {
			bw.write("Korea International School");
		}else {
			bw.write("St. Johnsbury Academy");
		}
		bw.flush();
		br.close();
	}
}
