import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			
			String str[] = br.readLine().split("/");
			int K = Integer.parseInt(str[0]);
			int D = Integer.parseInt(str[1]);
			int A = Integer.parseInt(str[2]);
			
			if(K+A < D) {
				bw.write("hasu");
			}else if(D==0) {
				bw.write("hasu");
			}else {
				bw.write("gosu");
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}