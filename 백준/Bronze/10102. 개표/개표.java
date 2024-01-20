
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split("");
		int A = 0;
		int B = 0;
		
		for(int i = 0; i<count; i++) {
			if(str[i].equals("A")){
				A++;
			}else {
				B++;
			}
		}
		if(A>B) {
			bw.write("A");
		}else if(A<B) {
			bw.write("B");
		}else {
			bw.write("Tie");
		}
		
		bw.flush();
		br.close();
	}
}
