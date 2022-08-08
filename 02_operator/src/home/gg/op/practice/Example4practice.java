package home.gg.op.practice;

public class Example4practice {

	public static void main(String[] args) {
		
		// a는 100을 넘는 숫자이면서 짝수인가?
	int	a = 70;
	boolean result1  = a >= 100;
	boolean result2 = a % 2 == 0;
	
	System.out.println( "a는 100을 넘는 숫자이면서 짝수인가? : " + (result1 && result2));
	
				
		
	}
}
