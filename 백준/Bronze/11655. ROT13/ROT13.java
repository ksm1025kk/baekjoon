

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                if (c <= 'M') {
                    word += (char) (c + 13);	
                } else {
                    word += (char) (c - 13);	
                }
            }
            else if (c >= 'a' && c <= 'z') {
                if (c <= 'm') {
                    word += (char) (c + 13);	
                } else {
                    word += (char) (c - 13);	
                }
            } else {
                word += c;	
            }
        }

        bw.write(word);
        bw.flush();
        br.close();
    }
}
