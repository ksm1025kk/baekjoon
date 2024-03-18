
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		while(count!=0) {
			String str[] = br.readLine().split(" ");
			int hp = Integer.parseInt(str[0]) + Integer.parseInt(str[4]);
			int mp = Integer.parseInt(str[1]) + Integer.parseInt(str[5]);
			int st = Integer.parseInt(str[2]) + Integer.parseInt(str[6]);
			int am = Integer.parseInt(str[3]) + Integer.parseInt(str[7]);
			
			if(hp<1) {
				hp = 1;
			}
			if(mp<1) {
				mp = 1;
			}
			if(st<0) {
				st = 0;
			}
			bw.write((hp + mp*5 + st*2 + am*2) + "");
			bw.newLine();
			count--;
		}
		
		bw.flush();
		br.close();
	}
}

		