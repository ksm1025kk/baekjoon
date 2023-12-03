import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int count = Integer.parseInt(br.readLine());
			while(count!=0) {
				int car = Integer.parseInt(br.readLine());
				int option_count = Integer.parseInt(br.readLine());
				int option = 0;
				while(option_count != 0) {
					String str[] = br.readLine().split(" ");
					int option_num = Integer.parseInt(str[0]);
					int option_view = Integer.parseInt(str[1]);
					option += (option_num*option_view);
					option_count--;
				}
				
				bw.write("" + (car + option));
				bw.newLine();
				count--;
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
