package for문연습;

public class forTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이중 for 문, for 문안에 또 for 문이 있다
				int i,j; //각각 외부와 내부에서 카운트할 변수가 2개 필요하다
				for(i=1; i<=5; i++) {
					for(j=1; j<=5; j++) {
						System.out.printf("i=%d j=%d\n", i, j);
					}
				}
				//i=1 j=1,2,3,4,5 외부의 loop가 m
				//i=2 j=1,2,3,4,5 내부의 loop기 n m by n 만큼 반복
				//i=3 j=1,2,3,4,5
				//i=4 j=1,2,3,4,5
				//i=5 j=1,2,3,4,5
				//1부터10번출력
				
				for(i=1; i<=10; i++) {
					for(j=1; j<=10; j++) {
						System.out.printf("%4d",j);
					}
					System.out.println();
				}
				
	}

}
