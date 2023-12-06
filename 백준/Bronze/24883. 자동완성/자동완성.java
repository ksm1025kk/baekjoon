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
				
			switch (str) {
			case "N": 
				bw.write("Naver D2");
				break;
			case "n":
				bw.write("Naver D2");
				break;
			
			default:
				bw.write("Naver Whale");
				break;
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}