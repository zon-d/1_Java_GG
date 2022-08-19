package home.practice;

import java.util.Scanner;

public class Practice2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	// 소수 판별
    // 소수 : 1과 자기 자신(X) 외에는 나누어 떨어지지 않는 수
    // ->   X % 2 ~ X-1 까지  
    //  나머지가 0인 경우가 있다면 : 소수 아님
    //  나머지가 0인 경우가 없다면 : 소수다.
	
		boolean flag = true;
		
	System.out.print("소수를 입력하세요 : ");
	int input = sc.nextInt();
	
	for(int i=2 ; i<input ; i++) {
		if(input % 2 == 0) {
			System.out.println(input + "은 소수가 아닙니다.");
			flag = false;
			break;
			
		}
	}if(flag) {
		System.out.println(input + "은 소수입니다.");
	}
	

	
}
}
