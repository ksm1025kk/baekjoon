import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int count = Integer.parseInt(br.readLine());
			while (count != 0) {
				ArrayList<Integer> list = new ArrayList<>();
				String str[] = br.readLine().split(" ");
				int a[] = new int[7];
				for (int i = 0; i < 7; i++) {
					a[i] = Integer.parseInt(str[i]);
				}

				int even = 0;
				for (int i : a) {
					if (i % 2 == 0) {
						even += i;
						list.add(i);
					}
				}
				int max = 100;
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i) <= max) {
						max = list.get(i);
					}
				}
				bw.write(even + " " + max);
				bw.newLine();
				count--;
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
