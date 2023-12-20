import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int count = 0;
			for(int i=0; i<8; i++) {
				String str = br.readLine();
				for(int j=0; j<8; j++) {
					if((i+j)%2 == 0 && str.charAt(j)=='F') {
						count++;
					}
				}
			}
			bw.write("" + count);
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}