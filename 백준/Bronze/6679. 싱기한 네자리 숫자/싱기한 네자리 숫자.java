

public class Main {
	public static void main(String[] args) throws Exception{
			for(int i=1000; i<=9999; i++)
			{
				int sum_10 = 0;
				int sum_12 = 0;
				int sum_16 = 0;
				
				for(int n=i; n>0; n/=10)
					sum_10 += n%10;
				
				for(int n=i; n>0; n/=12)
					sum_12 += n%12;
				
				for(int n=i; n>0; n/=16)
					sum_16 += n%16;
				
				if(sum_10 == sum_12 && sum_12 == sum_16)
					System.out.println(i);
			}
		}
}
