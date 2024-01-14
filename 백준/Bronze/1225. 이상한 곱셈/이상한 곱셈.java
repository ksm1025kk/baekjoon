
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str[] = br.readLine().split(" ");
		long res = 0;
		for(int i = 0; i < str[0].length(); i++) {
			for(int j  = 0; j < str[1].length(); j++) {
				res += Integer.parseInt(str[0].charAt(i) + "")*Integer.parseInt(str[1].charAt(j) + "");
			}
		}
		bw.write(res + "");
		bw.flush();
		br.close();
	}
}
