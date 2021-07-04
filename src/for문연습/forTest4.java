package for문연습;

public class forTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//알파벳을 for문을 사용해서 출력하기
				//AB-65
				int i;
				for(i='A'; i<='Z'; i++)
					System.out.println((char)i); //char은 'A', 'Z'라고 시작과 끝을 넣음 저 두개의 글자는 char
				//,즉 글자가 아닌 유니코드이므로 유니코드 계산하라는거 여기서 우리가 출력으로 받고싶은 값은 A, B, C, D ... 알파벳이므로 반ㄷ시 char를 붙여야함
				System.out.println();
				// 1 2 3 4 5 7 8 10
				//11 12 13 ....
				for(i=1; 1<=100; i++) {
					System.out.printf("%3d",i);
					if(i%10==0) //i를 10으로 나누고 나온 나머지 값이 0과 같다
						System.out.println();
					
				}
	}

}
