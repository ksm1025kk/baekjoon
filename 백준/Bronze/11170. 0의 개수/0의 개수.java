

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int num = Integer.parseInt(br.readLine());
		while(num!=0) {
			int count = 0; 
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			for(int i = a; i <=b; i++) {
				String k = Integer.toString(i);
				for(int j = 0; j < k.length(); j++) {
					if(k.charAt(j) == '0') {
						count++;
					}
				}
			}
			bw.write(count + "");
			bw.newLine();
			num--;
		}
		bw.flush();
		br.close();
	}
}
