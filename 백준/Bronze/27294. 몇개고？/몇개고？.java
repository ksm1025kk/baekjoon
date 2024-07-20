import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		if(a<12) {
			bw.write("280");
		}else if(a<17) {
			if(b == 0) {
				bw.write("320");
			}else {
				bw.write("280");
			}
		}else {
			bw.write("280");
		}
		
		bw.flush();
		br.close();
	}
}
