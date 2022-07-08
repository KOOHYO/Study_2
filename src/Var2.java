
public class Var2 {

	public static void main(String [] args) {
		
		//2.1234;
		double num = 2.1234;
		
		float num2 = 2.1234F;
		
		float num3 = num2;
		
		System.out.println(num);
		
		//System.out.println(56789); -> int
		
		//System.out.println(2.3256F); -> float
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = kor + math + eng;
		
		kor = 50;
		math = 50;
		eng = 50;
		
		System.out.println(total);
		
		char ch = '한';
		System.out.println(ch);
		
		char ch2 = ' '; //초기값은 스페이스 한번
		double d1 = 0.0; //초기값
		float d2 = 0.0F; //초기값
		
		boolean check = true;
		check = false;
		
		boolean check2 = false; //초기값
		
		//변수 선언 공식
		//데이터타입명 변수명
		String name = "abc";
		String name2 = new String(); //원래 이렇게 쓰는데 귀찮아서 쌍다운표로(프리미티브타입) 감싸주는거임
		
		System.out.println('b'); //char 타입
		System.out.println('1'); //char 타입
		System.out.println("abc"); //String 타입
		
	}
	
}
