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
			String str = br.readLine();
			bw.write((str.charAt(0) + "").toUpperCase() + str.substring(1));
			bw.newLine();
			count--;
		}
		
		bw.flush();
		br.close();
	}
}
