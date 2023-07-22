package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnum = 0;
		int sum = 0 ;
		int secnum = 1;
		System.out.println(firstnum );
		System.out.println(secnum );
	 for(int i=2;i<=11;i++)
	 {
		sum = firstnum +secnum;
		firstnum = secnum;
		secnum = sum;
		System.out.println(sum);
	 }
	}
}
