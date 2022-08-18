package ed.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
		public void practice1() {
			
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//		
//		[실행 화면]
//		1 2 3 4 5 6 7 8 9
//		짝수 번째 인덱스 합 : 25
			
		
		int[] arr;
		arr = new int [9];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		
		int sum = 0;
		
		for(int i=0 ; i<arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
			
			if(i%2 == 0) sum+=arr[i];
			
		}
		
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
		
	}

		
		public void practice2() {
			
//		메소드 명 : public void practice2(){}
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//		[실행 화면]
//		9 8 7 6 5 4 3 2 1
//		홀수 번째 인덱스 합 : 20
			
		int[] arr;
		arr = new int [9];
		
		arr[0]=9;
		arr[1]=8;
		arr[2]=7;
		arr[3]=6;
		arr[4]=5;
		arr[5]=4;
		arr[6]=3;
		arr[7]=2;
		arr[8]=1;
		
		int sum = 0;
		
		for(int i=0 ; i<arr.length; i++) {
			
			System.out.print(arr[i]+ " ");
			
			if(i%2 != 0) sum+=arr[i];
			
		}
		
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
		

		public void practice3() {
			
		
//			사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//			
//			[실행 화면]
//			양의 정수 : 5
//			1 2 3 4 5
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] +" ");
				
	}
				
			
		

//		public void practice4() {
//			
////			정수 5개를 입력 받아 배열을 초기화 하고
////			검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
////			배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다" 출력
////			
////			[실행 화면 1]
////			입력 0 : 5
////			입력 1 :
////			입력 2 :
////			입력 3 :
////			입력 4 :
////			검색할 값 : 8
////			인덱스 : 1
//										
//		Scanner sc = new Scanner(System.in);
//			
//		int[] arr = new int[4];
//		
//		arr[0] = 5;
//		arr[1] = 8;
//		arr[2] = 9;
//		arr[3] = 10;
//		arr[4] = 4;
//		
//		System.out.println("입력 " + arr.length);
//		
////		System.out.println(arr);
////		System.out.println("검색할 값 : ");
////		int num1 = sc.nextInt();
////		
////		
//		
//		
//		}
//		
//		public void practice5() {
//			
////		메소드 명 : public void practice5(){}
////		문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
////		검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
////		[실행 화면]
////		문자열 : application
////		문자 : i
////		application에 i가 존재하는 위치(인덱스) : 4 8
////		i 개수 : 2
//			
//			
//			
//		}
//		
//		public void practice6() {
//		
////		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
////		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
////		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
////		[실행 화면]
////		정수 : 5
////		배열 0번째 인덱스에 넣을 값 : 4
////		배열 1번째 인덱스에 넣을 값 : -4
////		배열 2번째 인덱스에 넣을 값 : 3
////		배열 3번째 인덱스에 넣을 값 : -3
////		배열 4번째 인덱스에 넣을 값 : 2
////		4 -4 3 -3 2
////		총 합 : 2
//			
//		}
//		
//		public void practice7() {
//			
//			
//		}
//		
//		public void practice8() {
//			
//			
//		}
//		
		public void practice9() {
			
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
//		[실행 화면]
//		발생한 난수 : 9 7 6 2 5 10 7 2 9 6 
			
		System.out.print("발생한 난수 : ");
		
		int[] num = new int[10];
		
		for(int i=0 ; i<num.length ; i++) {
			
			int ran = (int)(Math.random()*11);
			
			System.out.print(ran + " ");
			
			num[i] = ran;
		}
	}
//				
//		
//			public void practice10() {
//				
//			}
//			
//			public void practice11() {
//				
//				
////			10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
////			1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
////
////			[실행 화면]
////			4 1 3 6 9 5 8 10 7 2
//				
//			
//			}
//			
	public void practice12() {
		
		
//			로또 번호 자동 생성기 프로그램을 만들기.
//			(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
//
//			[실행 화면]
//			3 4 15 17 28 40
		
		int[] lotto = new int[6];
		
		
		for(int i=0 ; i<lotto.length ; i++) {
			
			int ran = (int)(Math.random()*45+1);
			
			lotto[i] = ran;
			
			for(int x=0 ; i<x ; x++) {
				
				if(lotto[x] == ran) {
					i--;
					break;
				}
			}
	}
			Arrays.sort(lotto);
			
			System.out.println(Arrays.toString(lotto));
				
}
//			
//			
//			public void practice13() {
//				
//			}
//			public void practice14() {
//				
//			}
//			public void practice15() {
//				
//			}
//			public void practice16() {
//				
//			}
//			public void practice17() {
//				
//			}
//			public void practice18() {
//				
//			}
//			
}	

	


	


