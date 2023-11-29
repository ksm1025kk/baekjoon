import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int count1 = 4;
			int count2 = 2;
			
			int arr1[] = new int[4];
			int aa = 0;
			int arr2[] = new int[2];
			int bb = 0;
			while(count1 !=0) {
				int a = Integer.parseInt(br.readLine());
				arr1[aa] = a;
				aa++;
				count1--;
			}
			while(count2 !=0) {
				int a = Integer.parseInt(br.readLine());
				arr2[bb] = a;
				bb++;
				count2--;
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			bw.write("" + (arr1[3] + arr1[2] + arr1[1] + arr2[1]));
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
