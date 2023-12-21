import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int a = Integer.parseInt(br.readLine());
			String str[] = br.readLine().split(" ");
			int Y = 0;
			int M = 0;
			for(int i = 0; i < a; i++) {
				Y += (Integer.parseInt(str[i])/30)*10+10;
				M += (Integer.parseInt(str[i])/60)*15+15;
			}
			if(M>Y) {
				bw.write("Y " + Y);
			}else if(M<Y){
				bw.write("M " + M);
			}else {
				bw.write("Y M " + Y);
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}