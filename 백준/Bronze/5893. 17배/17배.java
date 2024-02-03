

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		BigInteger a = new BigInteger(str, 2);
		
		Stack<BigInteger> stack = new Stack<>();
		
		a = a.multiply(BigInteger.valueOf(17));
		
		while(true) {
			stack.push(a.remainder(BigInteger.valueOf(2)));
			a = a.divide(BigInteger.valueOf(2));
			if(a.equals(BigInteger.ONE)) {
				stack.push(a);
				break;
			}
		}
		
		while(!stack.isEmpty()){
			BigInteger b = stack.pop();
			System.out.print(b);
		}
		br.close();
	}
}

