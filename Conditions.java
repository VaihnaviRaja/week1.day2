package Week1.day2;

public class Conditions {

	public static void main(String[] args) {
		int num=5;
		char c = 'd';
		if((num==5)&&(c=='e'))
			System.out.println("Both are true");
		else if ((num==5)||(c=='e'))
		{
			System.out.println("Either condition is satisfied");
		
		}
		else
			System.out.println("Both are not satisfied");
		

	}

}
