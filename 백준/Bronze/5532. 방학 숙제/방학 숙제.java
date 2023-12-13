import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			
			int L = Integer.parseInt(br.readLine());
			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			int D = Integer.parseInt(br.readLine());
			int kor = 0;
			int math = 0;
			if(A%C > 0) {
				kor = A/C + 1;
			}else {
				kor = A/C;
			}
			if(B%D > 0) {
				math = B/D + 1;
			}else {
				math = B/D;
			}
			
			bw.write("" + (L-(Math.max(kor, math))));
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}