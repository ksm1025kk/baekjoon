

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			List<String> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			int num = Integer.parseInt(br.readLine());
			while(num!=0) {
				String str[] = br.readLine().split(" ");
				String word = str[0];
				int a = Integer.parseInt(str[1]);
				list1.add(word);
				list2.add(a);
				num--;
			}
			int max = 0;
			int index = 0;
			for(int i = 0; i < list2.size(); i++) {
				if(list2.get(i)>=max) {
					max = list2.get(i);
					index = i;
				}
			}
			bw.write(list1.get(index));
			bw.newLine();
			count--;
		}
		
		bw.flush();
		br.close();
	}
}
