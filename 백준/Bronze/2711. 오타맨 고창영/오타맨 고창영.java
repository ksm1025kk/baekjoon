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
			int a = Integer.parseInt(str[0]);
			if(a == 1) {
				bw.write(str[1].substring(a));
				bw.newLine();
			}else if(a == str[1].length()){
				bw.write(str[1].substring(0,a-1));
				bw.newLine();
			}else {
				String s1 = str[1].substring(0, a-1);
				String s2 = str[1].substring(a);
				bw.write(s1+s2);
				bw.newLine();
			}
			count--;
		}
		
		bw.flush();
		br.close();
	}
}