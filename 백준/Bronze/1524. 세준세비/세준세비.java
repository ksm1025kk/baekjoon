

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		
		while (count-- != 0) {
			String w = br.readLine();
			String str1[] = br.readLine().split(" ");
			int a1 = Integer.parseInt(str1[0]);
			int a2 = Integer.parseInt(str1[1]);

			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			String s2 = br.readLine();
			if(a1 == 1) {
				list1.add(Integer.parseInt(s2));
			}else {
				String str2[] = s2.split(" ");
				for (int i = 0; i < a1; i++) {
					list1.add(Integer.parseInt(str2[i]));
				}
			}
			
			String s3 = br.readLine();
			if(a1 == 1) {
				list2.add(Integer.parseInt(s3));
			}else {
				String str3[] = s3.split(" ");
				for (int i = 0; i < a2; i++) {
					list2.add(Integer.parseInt(str3[i]));
				}
			}
		
			Collections.sort(list1);
			Collections.sort(list2);
			
			int amax = list1.get(list1.size()-1);
			int bmax = list2.get(list2.size()-1);
			
			if(amax>bmax) {
				bw.write("S");
			}else if(amax<bmax) {
				bw.write("B");
			}else {
				bw.write("S");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
	}
}
