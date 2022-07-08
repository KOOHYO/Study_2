
public class Var9 {

	public static void main(String [] args) {
		System.out.println("Start");
		//편의점 계산 자동화 프로그램
		
		//물건 가격의 총합계
		int price=13250;
		
		//손님이 낸 돈
		int money=50000;
		
		//잔돈 계산
		int jandon = money-price;//;
		System.out.println(jandon);
		
		//만원짜리 갯수를 담을 변수
		int man = jandon/10000;
		System.out.println(man);
		
		//천원짜리 갯수를 담을 변수
		int chon = (jandon-man*10000)/1000;
		//int chon = jandon%10000/1000;
		System.out.println(chon);
		
		//백원짜리 갯수를 담을 변수
		int b =(jandon-(man*10000+chon*1000))/100;
		//int b = jandon%1000/100;
		System.out.println(b);

		//십원짜리 갯수를 담을 변수
		//int s = (jandon-(man*10000+chon*1000+b*100))/10;
		int s = jandon%100/10;
		System.out.println(s);
		
		System.out.println("만원 : "+man +" 장");
		System.out.println("천원 : "+chon+" 장");
		System.out.println("백원 : "+b+" 개");
		System.out.println("십원 : "+s+" 개");
		
		
		
	
		
		
		System.out.println("Finish");
		
		
	}
	
}
