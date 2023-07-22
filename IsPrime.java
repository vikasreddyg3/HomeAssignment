package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int i,num,n=27,count;
		for(num=1;num<=n;num++)
		{
			count=0;
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					
				}
			}
			
		
		if(count==0 && num!=1)
		{
			System.out.println(num+" is a prime number");
		}
		}

	}

}
