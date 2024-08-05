

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while (count-- != 0) {

			String str[] = br.readLine().split(" ");
			String[] a1Arr = str[0].split("");
			String[] a2Arr = str[1].split("");
			Arrays.sort(a1Arr);
			Arrays.sort(a2Arr);
			
			if ( Arrays.toString(a1Arr).equals(Arrays.toString(a2Arr)) ){
                bw.write(str[0] + " & " + str[1] + " are anagrams.");
            }else {
            	bw.write(str[0] + " & " + str[1] + " are NOT anagrams.");
            }
			bw.newLine();
		}

		bw.flush();
		br.close();
	}
}
