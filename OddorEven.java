package week1.day1;

public class OddorEven {

	public static void main(String[] args) {
		
		int sum =0,firstvalue = 0,secondvalue =1;
		//iterate first 5 values
		for(int i=0;i<=5;i++)
		{
			sum = firstvalue + secondvalue;
			firstvalue = secondvalue;
			secondvalue =sum;
			System.out.println(sum);
		}
}

}