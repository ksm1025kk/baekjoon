import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String str[] = br.readLine().split(" ");
		long a = Long.parseLong(str[0]+str[1]);
		long b = Long.parseLong(str[2]+str[3]);
		long c = a+b;
		bw.write(c + "");
		bw.flush();
		br.close();
	}
}