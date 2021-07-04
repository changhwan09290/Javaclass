package for문연습;

public class forTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 100까지 중에서, 짝수의 합과 홀수의 합을 각각 구하기
		 int i;
		 int even_sum=0;
	      int odd_sum=0;
	      
	      for(i=1; i<=100; i++)
	      {
	         if(i%2==0)
	            even_sum+=i;
	         else
	            odd_sum+=i;
	      }
	      
	      System.out.println("짝수의 합 " + even_sum );
	      System.out.println("홀수의 합 " + odd_sum );

	}

}
