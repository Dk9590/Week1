package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime number list is 2,3,5,7,11
		int num =3;
		int m;
	    int flag = 0;
		// Will 
		m = num/2;  
		if(num==0||num==1) // Making default condition for 0 and 1 as not a prime number
		{
			System.out.println("Given no is not a prime number");
			flag=1;
		}else
		{
		// will check the given number is a primenumber
		for(int i=2;i<=num;i++)
		{
			if(num/i==0)
			{
				System.err.println("Given no is not a prime number");
				flag=1;
				break;
				 // making the condition to set as not matched
			}
		}
		
		}
		
		
		if(flag==0)//the condition will execute when above else fails
		{
			System.out.println("Given no is prime  number");
		}
	}
		
		

}


