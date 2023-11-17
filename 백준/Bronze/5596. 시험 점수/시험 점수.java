import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String a[] = br.readLine().split(" ");
			String b[] = br.readLine().split(" ");
			int s[] = new int[a.length];
			int t[] = new int[b.length];
			
			for(int i = 0; i < a.length; i++) {
				s[i] = Integer.parseInt(a[i]);
				t[i] = Integer.parseInt(b[i]);
			}
			int sumA = 0;
			int sumB = 0;
			for(int i : s) {
				sumA += i;
			}
			for(int i : t) {
				sumB += i;
			}
			
			if(sumB == sumA) {
				bw.write(""  + sumA);
			}else {
				bw.write("" + Math.max(sumA, sumB));
			}
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
