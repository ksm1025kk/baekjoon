

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		String word = ":fan:";
		bw.write(word + word + word);
		bw.newLine();
		bw.write(word + ":" + str + ":" + word);
		bw.newLine();
		bw.write(word + word + word);
		
		bw.flush();
		br.close();
	}
}
