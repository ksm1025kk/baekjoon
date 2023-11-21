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
			String a = str[0];
			String b = str[1];
			StringBuilder sb1 = new StringBuilder(a);
			a = sb1.reverse().toString();
			StringBuilder sb2 = new StringBuilder(b);
			b = sb2.reverse().toString();
			
			int c = Integer.parseInt(a) + Integer.parseInt(b);
			String d = Integer.toString(c);
			StringBuilder sb3 = new StringBuilder(d);
			String f = sb3.reverse().toString();
			int e = Integer.parseInt(f);
			bw.write("" + e);
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
