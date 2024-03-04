
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str[] = br.readLine().split(" ");
		int size = Integer.parseInt(str[0]);
		int arr[] = new int[size];
		int a = Integer.parseInt(str[1]);
		for(int i = 0; i<size; i++) {
			arr[i] = i+1;
		}
		while (a != 0) {
			String str2[] = br.readLine().split(" ");
			int first = Integer.parseInt(str2[0])-1;
			int last = Integer.parseInt(str2[1])-1;
			
			while(first<last) {
				int c = arr[first];
				arr[first++] = arr[last];
				arr[last--] = c;
			}
			
			a--;
		}
		for(int i = 0 ; i<arr.length; i++) {
			bw.write(arr[i] + " ");
		}
		bw.flush();
		br.close();
	}

}