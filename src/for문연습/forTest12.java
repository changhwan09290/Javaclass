package for문연습;

public class forTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int k = 0;
		for(i=1; i<=10; i++)
		{
			k=0;
			for(j=1; j<=i; j++)
			{
				System.out.printf("%d ", j);
				if(j!=i)
					System.out.print("+ ");
				k = k+j; 
			}
			System.out.printf(" = %d\n", k);
		}
	}

}
