

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		HashSet<Integer> hs = new HashSet<>();
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			hs.add(Integer.parseInt(str[i]));
		}
		ArrayList<Integer> al = new ArrayList<>(hs);
		Collections.sort(al);
		for(int i = 0; i < al.size(); i++) {
			bw.write(al.get(i) + " ");
		}
		bw.flush();
		br.close();
	}
}
