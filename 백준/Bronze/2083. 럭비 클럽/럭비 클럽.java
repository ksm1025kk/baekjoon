
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String str = br.readLine();
			if(str.equals("# 0 0")) {
				break;
			}
			String arr[] = str.split(" ");
			if(Integer.parseInt(arr[1]) > 17 || Integer.parseInt(arr[2])>=80) {
				bw.write(arr[0] + " Senior");
			}else {
				bw.write(arr[0] + " Junior");
			}
			bw.newLine();
		}
		bw.flush();
		br.close();
	}

}