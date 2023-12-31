import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 1;
		String word = "";
		while (true) {
			String str[] = br.readLine().split(" ");
			if (str[0].equals("0") && str[1].equals("0") && str[2].equals("0")) {
				break;
			}
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a == -1) {
				word = "a";
				if(b<c) {
					double s = Math.sqrt((c*c - b*b));
					String sp = String.format("%.3f", s);
					bw.write("Triangle #" + count);
					bw.newLine();
					bw.write(word + " = " +sp);
					bw.newLine(); 
					bw.newLine();
				}else {
					bw.write("Triangle #" + count);
					bw.newLine();
					bw.write("Impossible."); 
					bw.newLine(); 
					bw.newLine();
				}
			}else if(b == -1) {
				word = "b";
				if(a<c) {
					double s = Math.sqrt((c*c - a*a));
					String sp = String.format("%.3f", s);
					bw.write("Triangle #" + count);
					bw.newLine();
					bw.write(word + " = " +sp);
					bw.newLine(); 
					bw.newLine();
				}else {
					bw.write("Triangle #" + count);
					bw.newLine();
					bw.write("Impossible."); 
					bw.newLine(); 
					bw.newLine();
				}
			}else {
				word = "c";
				double s = Math.sqrt((a*a + b*b));
				String sp = String.format("%.3f", s);
				bw.write("Triangle #" + count);
				bw.newLine();
				bw.write(word + " = " +sp);
				bw.newLine(); 
				bw.newLine();
			}
			count++;
		}
		bw.flush();
		br.close();
	}
}