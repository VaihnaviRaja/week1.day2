package Week1.day2;

public class Fibonacci {  

	public static void main(String[] args) {
		System.out.println("The Fibonacci values are");
		int n1=0;
		int n2=1;
		System.out.println(n1);
		for(int i=2;i<=10;i++)
		{
			int sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}

	}

}
