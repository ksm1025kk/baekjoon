import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int count = Integer.parseInt(br.readLine());
			while(count!=0) {
				String str[] = br.readLine().split(" ");
				
				int N = Integer.parseInt(str[0]);
				int M = Integer.parseInt(str[1]);
				int U = (2*M)-N;
				int T = M-U;
				bw.write(U + " " + T);
				bw.newLine();
				count--;
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
