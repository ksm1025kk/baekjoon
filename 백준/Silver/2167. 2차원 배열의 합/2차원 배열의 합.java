

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int arr[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String num[] = br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(num[j - 1]);
            }
        }

        int q = Integer.parseInt(br.readLine());
        for (int k = 0; k < q; k++) {
            int res = 0;
            String st[] = br.readLine().split(" ");
            int x1 = Integer.parseInt(st[0]);
            int y1 = Integer.parseInt(st[1]);
            int x2 = Integer.parseInt(st[2]);
            int y2 = Integer.parseInt(st[3]);

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    res += arr[i][j];
                }
            }

            bw.write(res + "");
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
