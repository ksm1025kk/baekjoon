import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split("");
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(i==0) {
				count += 10;
			}else {
				if(str[i].equals("(")) {
					if(str[i-1].equals(str[i])) {
						count += 5;
					}else {
						count += 10;
					}
				}else {
					if(str[i-1].equals(str[i])) {
						count += 5;
					}else {
						count += 10;
					}
				}
			}
		}
		bw.write("" + count);
		bw.flush();
		br.close();
	}
}