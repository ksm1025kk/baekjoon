import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			
			String str = br.readLine();
			if(str.length() == 2) {
				char s1 = str.charAt(0);
				char s2 = str.charAt(1);
				int n1 = (int)s1-'0';
				int n2 = (int)s2-'0';
				
				bw.write("" + (n1+n2));
			}else if(str.length() == 3) {
				if(str.indexOf('0') == 1) {
					String s1 = str.substring(0, 2);	
					String s2 = str.substring(2);
					bw.write("" + (Integer.parseInt(s1) + Integer.parseInt(s2)));
				}else if(str.indexOf('0') == 2) {
					char s1 = str.charAt(0);
					int n1 = (int)s1 - '0';
					String s2 = str.substring(1);
					bw.write("" + (n1 + Integer.parseInt(s2)));
				}
			}else if(str.length() == 4) {
				bw.write("20");
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
