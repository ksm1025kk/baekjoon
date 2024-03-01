

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
		int a = Integer.parseInt(str[2])/(Integer.parseInt(str[0])*2);
		int b = Integer.parseInt(str[1])*a;
		bw.write(b + "");
		bw.flush();
		br.close();
	}

}