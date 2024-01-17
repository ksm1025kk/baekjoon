
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		while(true) {
			int b = Integer.parseInt(br.readLine());
			if(b==0) {
				break;
			}
			if(b % a == 0) {
				bw.write(b + " is a multiple of " + a + ".");
			}else {
				bw.write(b + " is NOT a multiple of " + a + ".");
			}
			bw.newLine();
		}
		
		bw.flush();
		br.close();
	}
}