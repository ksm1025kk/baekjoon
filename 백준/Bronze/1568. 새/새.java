

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int k = 1;
		int count = 0;
		while(true) {
			if(n==0) {
				break;
			}
			n-=k;
			k++;
			if(n<k) {
				k=1;
			}
			count++;	
			
		}
		bw.write(count + "");
		bw.flush();
		br.close();
	}
}
