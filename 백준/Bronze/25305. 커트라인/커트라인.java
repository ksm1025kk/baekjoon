import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			
			String str[] = br.readLine().split(" ");
			int person = Integer.parseInt(str[0]);
			int high = Integer.parseInt(str[1]);
			
			int p[] = new int[person];
			String str2[] = br.readLine().split(" ");
			for(int i = 0; i < p.length; i++) {
				p[i] = Integer.parseInt(str2[i]);
			}
			
			Arrays.sort(p);
			bw.write(p[p.length-high] + "");
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
