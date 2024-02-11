

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str[] = br.readLine().split(" ");
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);
        
        int n1 = (int)(a*b/c);
        int n2 = (int)(a/b*c);
        bw.write(Math.max(n1, n2) + " ");
        
		bw.flush();
		br.close();
	}
}