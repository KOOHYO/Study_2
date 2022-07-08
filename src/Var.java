
public class Var {

	public static void main(String[] args) {
		//변수 선언 공식
		//데이터타입 변수명
		byte num;
		// 대입 연산자 '=' : 오른쪽의 결과를 왼쪽에 대입하는 연산자
		num=10;
		System.out.println(num);
		num=35;
		System.out.println(num);
		//num=3000000;
		int num2;
		num2=4000000;
		long num3;
		num3 = 2000000000;
		
		byte num4 = 100+10;
		//num4 = num4 + 10;
		long num5 = 100L;
		//long num5 = 2L; 중복선언 에러(어느 값을 가져와야할지 몰라서)
		
		//선언
		int num6;
		//초기화(변수 선언 후 최초로 값을 선언)
		//모든 변수는 초기화 하지 않으면 사용시 에러
		num6=10;
		System.out.println(num6);
		
		int num7=0;
		
		
	}
}
