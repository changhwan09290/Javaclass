package for문연습;

public class forTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중for문 1부터 10까지 10번 출력하는거를 조금 바꿔서 
				//이중for문으로 1부터 100까지 출력
				int i,j; //각각 외부와 내부에서 카운트할 변수가 2개 필요하다
				 int k=1;
			      for(i=1; i<=10; i++)
			      {
			         for(j=1; j<=10; j++)
			         {
			            System.out.printf("%4d", k);
			            k++;
			         }
			         System.out.println();
			      }
			      
			      for(i=1; i<=10; i++)
			      {
			         for(j=1; j<=10; j++)
			         {
			            System.out.printf("%4d", (i-1)*10+j);
			         }
			         System.out.println();
			      }
	}

}
