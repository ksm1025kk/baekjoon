

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
		String str = br.readLine();
			if(str.equals("-1")){
				break;
			}		
			int count = 0;
			String str2[] = str.split(" ");
			for(int i = 0; i < str2.length-1; i++) {
				for(int j = 0; j < str2.length-1; j++) {
					if(Integer.parseInt(str2[i]) * 2 == Integer.parseInt(str2[j])) {
						count++;
					}
				}
			}
			bw.write(count + "");
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
