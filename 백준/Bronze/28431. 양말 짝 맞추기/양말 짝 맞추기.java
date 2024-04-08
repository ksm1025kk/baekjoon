

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 5;
		HashSet<Integer> list = new HashSet<>();

		while(n!=0) {
			int num = Integer.parseInt(br.readLine());
			if(list.contains(num)) {
				list.remove(num);
			}else {
				list.add(num);
			}
			
			n--;
		}
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
		   bw.write(iter.next() + "");
		}
		bw.flush();
		br.close();
	}
}

		