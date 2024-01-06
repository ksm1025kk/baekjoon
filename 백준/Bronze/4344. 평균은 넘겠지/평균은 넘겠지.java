import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			double a = (double)Integer.parseInt(str[0]);
			double b = 0.0;
			int c = 0;
			int d = 0;
			for(int i = 1; i<=a; i++) {
				c += Integer.parseInt(str[i]);
			}
			b = c/a;
			for(int i = 1; i<=a; i++) {
				if(Integer.parseInt(str[i]) > b) {
					d++;
				}
			}
			bw.write((String.format("%.3f", (d/a*100))) + "%");
			bw.newLine();
			count--;
		}
		
		bw.flush();
		br.close();
	}
}