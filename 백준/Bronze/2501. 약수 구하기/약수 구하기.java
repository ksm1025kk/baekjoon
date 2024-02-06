

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str[] = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				list.add(i);
			}
		}

		
		Collections.sort(list);
		if(list.size()<b) {
			bw.write("0");
		}else {
			bw.write(list.get(b-1) + "");
		}
		bw.flush();
		br.close();
	}
}
