package for문연습;

public class forTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for(num=1; num<=5; num++) {
			System.out.println(num);
		}
		System.out.println("for문 종료후");
		System.out.println(num);
		
		//2,4,6,8,10...20
		int i;
		for(i=2; i<=20; i+=2) 
		{System.out.println("%3d");};
		System.out.println();
		
	}

}
