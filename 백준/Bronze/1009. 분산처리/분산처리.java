
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int num = 1;
			
			for(int i = 0; i < b; i++) {
				num = (num * a) % 10;
			}

			if(num == 0) {
				bw.write(10 + "");
			}else {
				bw.write(num + "");
			}
			bw.newLine();
			count--;
		}
		
		
		bw.flush();
		br.close();
	}
}

		