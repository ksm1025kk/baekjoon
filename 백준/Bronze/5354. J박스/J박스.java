
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		while(a!=0) {
			int b = Integer.parseInt(br.readLine());
			for(int i = 0; i < b; i++) {
				for(int j = 0; j < b; j++) {
					if(i == 0 || i == (b-1) || j == 0 || j == (b-1)) {
						bw.write("#");
					}else {
						bw.write("J");
					}
				}
				bw.newLine();
				
			}
			bw.newLine();
			a--;
		}
		bw.flush();
		br.close();
	}
}
