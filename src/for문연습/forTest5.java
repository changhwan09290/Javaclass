package for문연습;

public class forTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//알파벳 순서대로 100개 만들기
		
			int i;
			char K = 'A';
			for(i=1; i<=100; i++)
			{
				System.out.printf("%4c", K);
				K++;
				if(K>'Z')
					K='A';
				
				if (i%10==0)
					System.out.println();
			}
	}

}
