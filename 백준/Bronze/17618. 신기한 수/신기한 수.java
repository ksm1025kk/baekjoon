

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		long a = Long.parseLong(br.readLine());
		int w = 0;
		for(long i = 1; i <= a; i++) {
			long res = 0;
            long num = i;
            
            while (num != 0) {
                res += num % 10;
                num /= 10;
            }
           
            if(i%res == 0) {
            	w++;
            }
		}
		bw.write(w + "");
		bw.flush();
		br.close();
	}
}
