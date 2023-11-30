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
			int q = 25;
			int d = 10;
			int n = 5;
			int p = 1;
			
			while(count!=0) {
				int a = Integer.parseInt(br.readLine());
				int qa = a/q;
				int qb = a%q;
				int da = qb/d;
				int db = qb%d;
				int na = db/n;
				int nb = db%n;
				int pa = nb/p;
				int pb = nb%p;
				
				bw.write(qa + " " + da + " " + na + " " + pa);
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
