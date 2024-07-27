

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str[] = br.readLine().split(" ");
        Double r = Double.parseDouble(str[0]);
        Double c = Double.parseDouble(str[1]);
        Double n = Double.parseDouble(str[2]);

        long x = (long) Math.ceil(r / n);
		long y = (long) Math.ceil(c / n);
		bw.write((x*y) + "");
        bw.flush();
        br.close();
    }
}
