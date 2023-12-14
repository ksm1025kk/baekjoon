import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			
			int n = Integer.parseInt(br.readLine());
			int p = Integer.parseInt(br.readLine());
			if(n < 5) {
				bw.write("" + p);
			}else if(n < 10) {
				if(p - 500 < 0) {
					bw.write("0");
				}else {
					bw.write("" + (p-500));
				}
			}else if(n < 15) {
				if(p - 500 < 0) {
					bw.write("0");
				}else {
					int r1 = (p-500);
					int r2 = (int)(p*0.9);
					bw.write("" + Math.min(r1, r2));
				}
			}else if(n < 20) {
				if(p-500 < 0) {
					bw.write("0");
				}else if(p-2000 < 0) {
					bw.write("0");
				}else {
					int r1 = (p-500);
					int r2 = (int)(p*0.9);
					int r3 = (p-2000);
					bw.write("" + (Math.min(Math.min(r1,r2),r3)));
				}
			}else {
				if(p - 500 < 0) {
					bw.write("0");
				}else if(p - 2000 < 0) {
					bw.write("0");
				}else {
					int r1 = (p-500);
					int r2 = (int)(p*0.9);
					int r3 = (p-2000);
					int r4 = (int)(p*0.75);
					bw.write("" + (Math.min(Math.min(Math.min(r1,r2),r3),r4)));
				}
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}