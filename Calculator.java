package Week1.day2;

public class Calculator {
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;

	}
public static void main(String[] args) {
	Calculator c= new Calculator();
	int sub = c.sub(5, 6);
	int mul = c.mul(6, 7);
	System.out.println(sub);
	System.out.println(mul);
}
}
