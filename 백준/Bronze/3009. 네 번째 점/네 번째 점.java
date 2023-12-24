import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String str1[] = br.readLine().split(" ");
			String str2[] = br.readLine().split(" ");
			String str3[] = br.readLine().split(" ");
			
			int x = 0;
			int y = 0;
			
			if(Integer.parseInt(str1[0]) == Integer.parseInt(str2[0])) {
				x = Integer.parseInt(str3[0]);
			}else if(Integer.parseInt(str1[0]) == Integer.parseInt(str3[0])) {
				x = Integer.parseInt(str2[0]);
			}else {
				x = Integer.parseInt(str1[0]);
			}
			
			if(Integer.parseInt(str1[1]) == Integer.parseInt(str2[1])) {
				y = Integer.parseInt(str3[1]);
			}else if(Integer.parseInt(str1[1]) == Integer.parseInt(str3[1])) {
				y = Integer.parseInt(str2[1]);
			}else {
				y = Integer.parseInt(str1[1]);
			}
			bw.write(x + " " + y);
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}