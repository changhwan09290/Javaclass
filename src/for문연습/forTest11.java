package for문연습;

public class forTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int k;
		int out =0;
		for(i='A'; i<='Z';i++) {
			k='A'+1;
			for(j=0; j<=26; j++) {
				if(k>'Z') {
					k='A';
				}
				System.out.printf("%c",k);
				;
			}
			System.out.println();
		}
		
	}

}
