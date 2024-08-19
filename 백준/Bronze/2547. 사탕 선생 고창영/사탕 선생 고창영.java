
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		
		while(a-- != 0) {
			String str = br.readLine();
			int n = Integer.parseInt(br.readLine());
			BigInteger b = new BigInteger("0");
			BigInteger c = new BigInteger(Integer.toString(n));
			for(int i = 0; i < n; i++) {
				BigInteger num = new BigInteger(br.readLine());	
				b = num.add(b);
			}
			BigInteger e = b.mod(c);
			if(e.equals(BigInteger.ZERO)) {
				bw.write("YES");
			}else {
				bw.write("NO");
			}
			bw.newLine();
			
		}
		bw.flush();
		br.close();
	}
}
