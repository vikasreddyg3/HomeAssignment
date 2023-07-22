package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int firstNum=0;
		int secondNum=1;
		int sum=0;
		
		System.out.println(firstNum+"\n"+secondNum);
		
		for(int i=0;i<=56;i++)
		{
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
			if(i<=11)
			{
				System.out.println(sum);
			}
			
		}
		
	
		
		
		
		

	}

}
