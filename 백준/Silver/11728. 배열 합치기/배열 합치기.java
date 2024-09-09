

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String str[] = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int [] arr = new int[a+b];

        String str1[] = br.readLine().split(" ");
        for (int i = 0; i < a; i++) { 
			arr[i]= Integer.parseInt(str1[i]);
		}

  
        String str2[] = br.readLine().split(" ");
        for (int i = 0; i < b; i++) {
        	arr[i+a] = Integer.parseInt(str2[i]); 
        }

        Arrays.sort(arr);

        for (int num : arr) {
            bw.write(num + " ");
        }
        bw.flush();
        br.close();
    }
}
