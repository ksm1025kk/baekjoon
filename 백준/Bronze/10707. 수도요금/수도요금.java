import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int count = 5;
			int arr[] = new int[5];
			int i = 0;
			while(count!=0) {
				String str = br.readLine();
				arr[i] = Integer.parseInt(str);
				i++;
				count--;
			}
			int x = arr[0]*arr[4];
			int y = 0;
			if(arr[4]<=arr[2]) {
				y = arr[1];
			}else {
				y = arr[1] + ((arr[4]-arr[2])*arr[3]);
			}
			bw.write("" + Math.min(x, y));
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
