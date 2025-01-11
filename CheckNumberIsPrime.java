package project1;

public class CheckNumberIsPrime {
	public static void main(String[] args) {
		int num=13;
		boolean flag = true;
		if(num<=1) // 0 and 1 are not prime numbers
		{
			flag=false; 
		}
		
		   for(int i=2;i<=num;i++)
		{    
			//condition for non prime number
			if(num%i==0)
			flag=false;
			break;
			
		}
	
	if(flag) {
		System.out.println(num + " is a prime number");
		
	}else {
		System.out.println(num + " is not a prime number");
		
	}
	}
}
	
		
		
	
		
		
			
