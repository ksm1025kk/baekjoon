import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {

			String str[] = br.readLine().trim().split(" ");
			if(str[0].equals("")) {
				bw.write("0");
			}else {
				bw.write("" + str.length);				
			}

			bw.flush();
			br.close();
		} catch (Exception e) {	
			// TODO: handle exception
		}
	}
}
