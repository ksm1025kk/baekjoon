

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Long.parseLong(br.readLine());
		List<Long> list = new ArrayList<>();
		while(n!=0) {
			String str[] = br.readLine().split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			
			if(b-a>0) {
				list.add(b);
			}
			n--;
		}
		if(list.isEmpty()) {
			bw.write("-1");
		}else {
			Collections.sort(list);
			bw.write(list.get(0) + "");
		}
		bw.flush();
		br.close();
	}
}
