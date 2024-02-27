
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger count = new BigInteger(br.readLine());
		BigInteger one = new BigInteger("1");
		BigInteger zero = new BigInteger("0");
		while(!count.equals(zero)) {
			
			String str = br.readLine();
			bw.write(str.toLowerCase());
			bw.newLine();
			count = count.subtract(one);
		}
		bw.flush();
		br.close();
	}

}