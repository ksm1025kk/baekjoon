

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		BigInteger a = new BigInteger(str[0],2);
		BigInteger b = new BigInteger(str[1],2);
		BigInteger c = a.add(b);
		String word = c.toString(2);
		bw.write(word);
		bw.flush();
		br.close();
	}
}

		