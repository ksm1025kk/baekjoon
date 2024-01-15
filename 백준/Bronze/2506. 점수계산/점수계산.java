
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int score = 0;
		int combo = 0;
		if(str[0].equals("1")) {
			score++;
		}
		for(int i = 1; i < a; i++) {
			if(str[i].equals("1")) {
				if(str[i].equals(str[i-1])) {
					combo++;
					score += 1 + combo;
				}else {
					combo = 0;
					score += 1 + combo;
				}
			}
		}
		bw.write("" + score);
		bw.flush();
		br.close();
	}
}
