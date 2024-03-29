

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		int dal = 0;
		int fo = 0;
		while(count!=0) {
			if(dal == (2+fo) || (2+dal) == fo) {
				break;
			}
			String str = br.readLine();
			if(str.equals("D")) {
				dal++;
			}else {
				fo++;
			}
			count--;
		}
		bw.write(dal + ":" + fo);
		bw.flush();
		br.close();
	}
}

		