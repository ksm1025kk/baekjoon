
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int time = Integer.parseInt(br.readLine());
		int aa = time/60;
		int bb = time%60;
		a += aa;
		b += bb;
		
		if(b >=60) {
			a++;
			b -= 60;
		}else if(b == 60) {
			a++;
			b = 0;
		}
		
		if(a>=24) {
			a -= 24;
		}
		bw.write(a + " " + b);
		bw.flush();
		br.close();
	}
}
