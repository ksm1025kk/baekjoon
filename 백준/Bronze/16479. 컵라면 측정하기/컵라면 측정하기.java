import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double k = Double.parseDouble(br.readLine());
        String[] str = br.readLine().split(" ");
        double d1 = Double.parseDouble(str[0]);
        double d2 = Double.parseDouble(str[1]);
        String res;
        if(d1 == d2){
            res = Double.toString((k*k));
        }else if(d1>d2){
            res = Double.toString(((k*k)-(((d1-d2))/2)*((d1-d2)/2)));
        }else{
            res = Double.toString(((k*k)-(((d2-d1))/2)*((d2-d1)/2)));
        }

        if(res.contains(".0")){
           int r = (int)Double.parseDouble(res);
           bw.write(r + "");
        }else {
            bw.write(res);
        }

        bw.flush();
        br.close();
    }
}
