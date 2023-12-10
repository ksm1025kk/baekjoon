import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str1 = br.readLine();
			String str2[] = br.readLine().split(" ");
			int count = 0;
			
			for(String i : str2) {
				if(i.equals(str1)) {
					count++;
				}
			}
			
			bw.write(count + "");	
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
