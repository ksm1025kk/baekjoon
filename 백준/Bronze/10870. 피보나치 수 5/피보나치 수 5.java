import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			int a = Integer.parseInt(br.readLine());
			bw.write(fi(a) + "");
			bw.flush();
			br.close();
		

	}
	static int fi(int a) {
		if(a == 0) {
			return 0;
		}
		if(a == 1) {
			return 1;
		}
		return fi(a-1) + fi(a-2);
	}
}