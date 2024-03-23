

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
		while(count!=0) {
			int a = Integer.parseInt(br.readLine());
			String t[] = Integer.toBinaryString(a).split("");
			
			for(int i = t.length-1; i>=0; i--) {

				if(t[i].equals("1")){
					bw.write((t.length-1-i) + " ");
				}
			}
			bw.newLine();
			count--;
		}
		bw.flush();
		br.close();
	}
}

		