import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		int smile = str.length() - str.replace(":-)", "").length();
		int sad = str.length() - str.replace(":-(", "").length();
		
		if(smile == 0 && sad == 0) {
			bw.write("none");
		}else if(smile > sad) {
			bw.write("happy");
		}else if(sad > smile) {
			bw.write("sad");
		}else {
			bw.write("unsure");
		}
		bw.flush();
		br.close();
	}
}
