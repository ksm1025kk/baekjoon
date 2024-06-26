

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		HashMap<String , String> map = new HashMap<>();
		map.put("A+", "4.3");
		map.put("A0", "4.0");
		map.put("A-", "3.7");
		map.put("B+", "3.3");
		map.put("B0", "3.0");
		map.put("B-", "2.7");
		map.put("C+", "2.3");
		map.put("C0", "2.0");
		map.put("C-", "1.7");
		map.put("D+", "1.3");
		map.put("D0", "1.0");
		map.put("D-", "0.7");
		map.put("F", "0.0");
		
		String str = br.readLine();
		for(String key : map.keySet()) {
			while(key.equals(str)) {
				bw.write(map.get(key));
				break;
			}
		}
		bw.flush();
		br.close();
	}
}
