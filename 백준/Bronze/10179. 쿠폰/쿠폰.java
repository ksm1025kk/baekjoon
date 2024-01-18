

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		while(a!=0) {
			double b = Double.parseDouble(br.readLine());
			double c = b * 0.8;
			String res = String.format("%.2f", c);
			bw.write("$" + res);
			bw.newLine();
			a--;
		}
		
		bw.flush();
		br.close();
	}
}
