
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str[] = br.readLine().split(" ");
		if(Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4])) {
			bw.write("YES");
		}else {
			bw.write("NO");
		}
		bw.flush();
		br.close();
	}

}