
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		for(int i = 0; i < str.length; i++) {
			a -= Integer.parseInt(str[i]);
		}
		if(a <= 0) {
			bw.write("Padaeng_i Happy");
		}else {
			bw.write("Padaeng_i Cry");
		}
		
		bw.flush();
		br.close();
	}
}
