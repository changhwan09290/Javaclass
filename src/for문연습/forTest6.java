package for문연습;

public class forTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10까지의 합계를 구해보자
				/*
				 * y = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
				 * f(n)= 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
				 * f(n) =f(n-1) + n
				 * 
				 * i = 1 ~ 10 
				 * s = 0 합계는 0으로 두고
				 * i=1 s = 0 + 1
				 * i=2 s = 1 + 2
				 * i=3 s = s + 3  => s = s + i
				 */
				int i, s;
				s = 0 ;
				for(i=1; i<=10; i++) {
					s = s + i;
					System.out.printf("i=%d s=%d\n", i, s);
				}
					System.out.println("합계 " + s);
	}

}
