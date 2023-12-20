import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String str1[][] = new String[8][8];
			String str2[][] = new String[8][8];
			int count = 8;
			int num1 = 0;
			while (count != 0) {
				String str[] = br.readLine().split("");
				int num2 = 0;
				for (int i = 0; i < 8; i++) {
					str1[num1][num2] = str[num2];
					num2++;
				}
				num1++;
				count--;
			}

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (i % 2 == 0) {
						if (j % 2 == 0) {
							str2[i][j] = "F";
						}
					} else {
						if (j % 2 != 0) {
							str2[i][j] = "F";
						}
					}
				}
			}

			int w = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (str1[i][j].equals(str2[i][j])) {
						w++;
					}
				}
			}
			bw.write("" + w);
			bw.flush();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}