package a1114;

public class Logic1 {
    public static void main(String[] args) {
        int charCode = 'A';	
		//int charCode = 'a';	
		//int charCode = '5';	
		
		if( (65<=charCode) & (charCode<=90) ) {
			System.out.println("대문자 입니다.");
		}
		
		if( (97<=charCode) && (charCode<=122) ) { // &&가 연산이 빠름 앞의 것이 폴스면 뒤에 건 비교 안 함
			System.out.println("소문자 입니다.");
		}
		
		if( (48<=charCode) && (charCode<=57) ) {
			System.out.println("0~9 의 숫자입니다.");
		}
		
		//----------------------------------------------------------
		
		int value = 6;
		//int value = 7;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수 입니다.");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}		
    }
}
