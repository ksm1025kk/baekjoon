
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String str[] = br.readLine().split("");
			double a = Math.pow(Double.parseDouble(str[0]),5);
			double b = Math.pow(Double.parseDouble(str[1]),5);
			double c = Math.pow(Double.parseDouble(str[2]),5);
			double d = Math.pow(Double.parseDouble(str[3]),5);
			double e = Math.pow(Double.parseDouble(str[4]),5);
			int res = (int)(a+b+c+d+e);
			bw.write("" + res);
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

