

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str1[] = br.readLine().split("");
		String str2[] = br.readLine().split("");
		String word = "";
		for (int i = 0; i < str1.length; i++) {
			word += str1[i] + str2[i];
		}
		while(true) {
			String str3[] = word.split("");
			if(str3.length == 2) {
				break;
			}
			String str4 = "";
			for (int i = 0; i < str3.length - 1; i++) {
				int a = Integer.parseInt(str3[i]) + Integer.parseInt(str3[i + 1]);
				if(a>=10) {
					String str5[] = Integer.toString(a).split("");
					str4 += str5[1];
				}else {
					str4 += Integer.toString(a);
				}
			}
			word = str4;
		}
		bw.write(word + "");
		bw.flush();
		br.close();
	}
}
