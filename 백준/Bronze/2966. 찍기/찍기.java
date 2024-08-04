

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String word = br.readLine();
		
		char a[] = {'A','B','C','A','B','C','A','B','C','A','B','C'};
		char b[] = {'B','A','B','C','B','A','B','C','B','A','B','C'};
		char g[] = {'C','C','A','A','B','B','C','C','A','A','B','B'};
		int as = 0;
		int bs = 0;
		int gs = 0;
		int n = 0;
		for(int i = 0; i < count; i++) {
			if(word.charAt(i) == a[n]) {
				as++;
				
			}
			if(word.charAt(i) == b[n]) {
				bs++;
				
			}
			if(word.charAt(i) == g[n]) {
				gs++;
				
			}
			n++;
			if(n == 12) {
				n = 0;
			}
		}
		int max = 0;
		int []cnt = {as,bs,gs};
		for(int i = 0; i < cnt.length; i++){
            if(max < cnt[i])
                max = cnt[i];
        }
		bw.write(max + "");
		bw.newLine();
		for(int i = 0; i < cnt.length; i++){
            if(max == cnt[i]){
                switch(i){
                    case 0:
                    	bw.write("Adrian");
                    	bw.newLine();
                        break;
                    case 1:
                    	bw.write("Bruno");
                    	bw.newLine();
                        break;
                    case 2:
                    	bw.write("Goran");
                    	bw.newLine();
                        break;
                }
            }
        }
		
		bw.flush();
		br.close();
	}
}
