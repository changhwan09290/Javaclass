package for문연습;

import java.util.Scanner;

public class forTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 수를 입력받아서 홀수합, 짝수합 구하기(임의 수 10)
				int even_sum = 0;
			      int even_cnt = 0;
			      int odd_sum = 0;
			      int odd_cnt = 0;
				int num; //데이터 읽을 변수
				int i; //옆에서 숫자 세어줄 변수
				Scanner sc = new Scanner(System.in);
				System.out.print("임의의 정수 입력 :");
				for (i=1; i<=10; i++) {
					System.out.println("정수 :");
					num= sc.nextInt();
					if(num%2==0) { //짝수 일때 실행되는 코드
						even_sum=even_sum+num; //짝수의 합은 num
						even_cnt++; //cnt는 마지막에 출력하면서 평균을 구하려고 짝수의 갯수를 카운팅하는거
					}
					  else
				         {
				            odd_sum += num;
				            odd_cnt++;
				         }
				      }
				      
				      if(even_cnt>0)
				         System.out.printf("짝수의 평균 %d\n", even_sum/even_cnt);
				      
				      if(odd_cnt>0)
				         System.out.printf("홀수의 평균 %d\n", odd_sum/odd_cnt);
	}

}
